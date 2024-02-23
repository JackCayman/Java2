package Lesson1.Homework;

public class TestApp {
    public static void main(String[] args) {


        RunAndJump[] runners = new RunAndJump[3];
        runners[0] = new Cat("КОТ");
        runners[1] = new Robot("РОБОТ");
        runners[2] = new Human("Человек");


        Obstruction[] obstructions = new Obstruction[5];
        obstructions[0] = new Wall(2);
        obstructions[1] = new RunWay(250);
        obstructions[2] = new Wall(1);
        obstructions[3] = new RunWay(650);
        obstructions[4] = new Wall(1);

        for (RunAndJump runner : runners) {
            for (Obstruction obstruction : obstructions) {
                if (obstruction instanceof Wall) {
                    if (runner.jump() > ((Wall) obstruction).getHeight()) {
                        System.out.println("перепрыгнул");
                    } else {
                        System.out.println("не перепрыгнул");
                    }
                }
                if (obstruction instanceof RunWay) {
                    if (runner.run() > ((RunWay) obstruction).getRange()) {
                        System.out.println("Пробежал  дорожку");
                    } else {
                        System.out.println("не пробежал дорожку");
                    }
                }
            }
        }


    }
}