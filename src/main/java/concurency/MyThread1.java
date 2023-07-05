package concurency;

public class MyThread1 extends Thread{
    public MyThread1(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread = new MyThread1("myThread");
        myThread.start();
    }

}
