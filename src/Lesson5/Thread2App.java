package Lesson5;

public class Thread2App {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(500);

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Demon " + Thread.currentThread().getName());
        });
        thread2.setDaemon(true);
        thread2.start();
    }



}
