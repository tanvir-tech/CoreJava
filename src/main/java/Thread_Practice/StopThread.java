package Thread_Practice;

public class StopThread {
    public static void main(String[] args) throws InterruptedException {
        // extends
        MyThread t1 = new MyThread();
        t1.setName("Child 01");
        t1.start();

        Thread.sleep(2000);

        //t1.stop();// not recommended

        //t1.interrupt();// not works when sleeping

        t1.runningState = false;// works when also sleeping

    }
}
