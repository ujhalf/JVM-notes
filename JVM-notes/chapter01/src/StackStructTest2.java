/**
 * @Author Hui-min Lu
 * @Date 2021/1/9 13:42
 * @Version 1.0
 * @Description
 */
public class StackStructTest2 {
    public static void main(String[] args) throws InterruptedException {
      calc();
    }

    static int calc() throws InterruptedException {
        int i = 2;
        int j = 3;
        int c = 5;

        Thread.sleep(100000);
        System.out.println("hello");
        return (i+j)*c;

    }
}
