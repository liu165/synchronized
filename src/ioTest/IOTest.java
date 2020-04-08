package ioTest;
import	java.io.FileInputStream;
import java.io.*;

/**
 * @author xiaoliu
 * @date 2020/4/8 10:56
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\me\\Desktop\\Java 8实战.pdf");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\me\\Desktop\\1.pdf");
        byte [] bytes = new byte[1024];
        int length;
        long l = System.currentTimeMillis();
        while ((length=fis.read(bytes)) != -1){

            fos.write(bytes);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("time:"+(l2-l));
        fos.close();
        fis.close();

    }

}
