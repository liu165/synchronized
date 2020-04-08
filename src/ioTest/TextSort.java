package ioTest;

import java.awt.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xiaoliu
 * @date 2020/4/8 15:25
 */
public class TextSort {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\me\\Desktop\\新建文本文档.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\me\\Desktop\\1.txt"));
        // 读取数据
        String line  = null;
        while ((line = br.readLine())!=null) {
            // 解析文本
            String[] split = line.split("\\.");
            // 保存到集合
            lineMap.put(split[0],split[1]);
        }
        // 释放资源
        br.close();
        // 遍历map集合
        Set<Map.Entry<String, String>> entries = lineMap.entrySet();
        for (Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            bw.write(key+"."+value);
            // 写出换行
            bw.newLine();
        }
         // 释放资源
        bw.close();
    }
}
