package ioTest;

import java.io.*;

/**
 * @author xiaoliu
 * @date 2020/4/8 14:09
 */
public class BufferIOTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\me\\Desktop\\Java 8实战.pdf");
        BufferedInputStream bfis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream
                ("C:\\Users\\me\\Desktop\\1.pdf");
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        byte [] bytes = new byte[1024];
        int length;
        long l = System.currentTimeMillis();
        while ((length=bfis.read(bytes)) != -1){
            bfos.write(bytes);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("time:"+(l2-l));
        bfos.close();
        fos.close();
        bfis.close();
        fis.close();
    }
}