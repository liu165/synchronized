package test;

/**
 * @author xiaoliu
 * @date 2020/4/8 17:03
 */
public class LambadalateTest {
    public static void main(String[] args) {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行线程run方法");
                }
            }).start();
            Long j=100000000000000L;
            while (j>0){
              //  System.out.println("***");
                j--;
            }
            int i = 1/0;
        }
        catch (Exception e) {
            System.out.println("执行异常的方法");
        }
    }

}
