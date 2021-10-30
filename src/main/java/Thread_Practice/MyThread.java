package Thread_Practice;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyThread extends Thread {

    public boolean runningState = true;

    @Override
    public void run() {
        //start run
        while (runningState) {
            this.showTime();
            // checking interrupt
            if (Thread.interrupted()) {
                System.out.println("Thread is interrupted.");
                runningState = false;
            }
        }
        System.out.println("Ending....." + Thread.currentThread().getName());
        //end run
    }

    //showTime
    public void showTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:s a");
        String formated_CurrentTime = LocalTime.now().format(dateTimeFormatter);
        System.out.println(formated_CurrentTime);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
