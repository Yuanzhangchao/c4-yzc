import java.*;
public class test10 {
    private int i = 0; //成员变量 i
    private final Object obj = new Object(); //锁
    /**
     * 奇数打印方法，由奇数线程调用
     */
    public void printOdd() {
        while (i < 10) {
            synchronized (obj) {
                if (i % 2 != 0) {
                    System.out.println("奇数：" + i); //打印 10 以内的奇数
                    i++;
                    obj.notify();//奇数打印完成后唤醒偶数线程打印
                } else {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    /**
     * 偶数打印方法，由偶数线程调用
     */
    public void printEven() {
        while (i < 10) {
            synchronized (obj) {
                if (i % 2 == 0) {
                    System.out.println("偶数：" + i); //打印 10 以内的偶数
                    i++;
                    obj.notify();//唤醒奇数线程打印
                } else {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        test10 oddEvenDemo = new test10();
        new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenDemo.printOdd();
            }
        }).start(); //启动奇数打印线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenDemo.printEven();
            }
        }).start(); //启动偶数打印线程
    }

}
