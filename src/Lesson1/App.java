package Lesson1;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        ComputerUser user = new ComputerUser(312 );
        user.getId();
        Guard guard = new Guard();
        boolean canPass = guard.canPass(user);
    }
}
