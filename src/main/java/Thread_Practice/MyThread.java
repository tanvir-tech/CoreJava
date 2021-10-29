package Thread_Practice;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("From : "+Thread.currentThread().getName() + " extending Thread");
    }
}
