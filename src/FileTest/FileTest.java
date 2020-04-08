package FileTest;

import java.io.File;

import	java.io.File;
/**
 * @author xiaoliu
 * @date 2020/4/8 10:19
 */
public class FileTest {
    public static void main(String[] args) {
        File f = new File("F:\\书籍资料\\baidu网盘\\ant_1.3.2");
//        System.out.println(f);
//        System.out.println(File.separator);
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.toURI());
//        File[] files = f.listFiles();
//        for (File file : files){
//            System.out.println(file);
//        }
        printDir(f);
    }
    public static void printDir(File dir) {
        // 获取子文件和目录
        File[] files = dir.listFiles();

        // 循环打印
        for (File file : files) {
            if (file.isFile()) {
                // 是文件，判断文件名并输出文件绝对路径
//                if (file.getName().endsWith(".java")) {
//                }

                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                // 是目录，继续遍历,形成递归
                printDir(file);
            }
        }
    }
    public static void printDir3(File dir) {
        // lambda的改写  在listFiles返回file时就已经进行过滤了 f是函数式接口的参数
        File[] files = dir.listFiles(f ->{
            return f.getName().endsWith(".java") || f.isDirectory();
        });

        // 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir3(file);
            }
        }
    }
}
