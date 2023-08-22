public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread, "T1");
        Thread t2 = new Thread(myThread, "T2");
        Thread t3 = new Thread(myThread, "T3");
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
        t1.join();
        System.out.println("End of main");
    }
}
class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }

}
