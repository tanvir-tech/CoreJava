package Thread_Practice;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("From : "+Thread.currentThread().getName() + " implementing Runnable interface");
    }
}
