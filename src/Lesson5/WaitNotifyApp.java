package Lesson5;

public class WaitNotifyApp {

    Object locer = new Object();

    private String currentLetter = "B";

    public static void main(String[] args) {
        WaitNotifyApp app = new WaitNotifyApp();
        Thread t1 = new Thread(() -> {
            app.printA();
        });
        Thread t2 = new Thread(() -> {
            app.printB();
        });
        t1.start();
        t2.start();
    }

    public void printA() {
        synchronized (locer) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentLetter.equals("A")) {
                        locer.wait();
                    }
                    System.out.print("A");
                    currentLetter = "B";
                    locer.notifyAll();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
    public void printB() {
        synchronized (locer) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentLetter.equals("B")) {
                        locer.wait();
                    }
                    System.out.print("B");
                    currentLetter = "A";
                    locer.notifyAll();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}



