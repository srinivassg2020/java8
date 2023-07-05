package concurency;

public class MyRunnable implements Runnable {
    /*public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }*/
    public void run() {
        while(true) {
            doSomethingUseful();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void doSomethingUseful() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable(), "myRunnable");
        myThread.start();
    }
}

