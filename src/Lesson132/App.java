package Lesson1;

public class App {
    public static void main(String[] args) {
        User user1 = new CompUser(01,"Vasya",18);
        Guard guard1 = new Guard();
        boolean canPass = guard1.canPass(user1);
    }

}
