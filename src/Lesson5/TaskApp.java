package Lesson5;

public class TaskApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new MyThread();
        thread2.start();
        thread1.start();
        System.out.println("Всё запущено и сделанно, В ожидании остальных");


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 15; i++) {
                    System.out.println("Thread " + i);
                }
            }
        });
        thread3.start();
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                System.out.println("Thread " + i);
            }
        });
        thread4.start();



    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + i);
            }
        }
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + i);
            }
        }
    }
}
