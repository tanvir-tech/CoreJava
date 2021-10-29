package Thread_Practice;

public class ThreadCreate {
    public static void main(String[] args) {

        // extends
        MyThread t1 = new MyThread();
        t1.setName("Child 01");
        t1.start();


        //implements
        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.setName("Child 02");
        t2.start();

        //Anonymous inner class
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("From : "+Thread.currentThread().getName() + " Anonymous inner class");
            }
        });
        t3.setName("Child 03");
        t3.start();

        // lambda
        Thread t4 = new Thread(()->{
            System.out.println("From : "+Thread.currentThread().getName() + " lambda");
        });
        t4.setName("Child 04");
        t4.start();
    }
}
