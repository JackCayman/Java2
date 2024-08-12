package Lesson1;

public class Guard {

    boolean canPass(User user){
        if(user.getAge()>=18){
            return true;
        }else {
            return false;
        }
    }




}
