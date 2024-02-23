package Lesson1;

public class Guard {

    boolean canPass(User user) {
        return user.gateAgeBefore18() == 18;
    }
}
