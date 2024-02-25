package Lesson5;

public class DeadLockApp {

    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();

         new Thread(() ->{
             synchronized (lock1){
                 System.out.println("Thread-1 block lock1");
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 synchronized (lock2){
                     System.out.println("Thread-1 block lock2");
                 }
             }
         }).start();
        new Thread(() ->{
            synchronized (lock2){
                System.out.println("Thread-2 block lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Thread-2 block lock1");
                }
            }
        }).start();
    }
}
