package Lesson5;

public class JoinApp {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });

       // thread1.setPriority(10)//;1-min,5-norm,10-max

        thread1.start();
        thread1.join();
        System.out.println("END");
    }
}
