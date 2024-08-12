package Lesson1.Homework;

public class App {
    public static void main(String[] args) {

        Robot robot = new Robot("Robot");
        Cat cat = new Cat("Cat");
        Human human = new Human("Human");
        Movement[] sportsmans = {robot, cat, human};

        Treadmill treadmill1 = new Treadmill(2);
        Treadmill treadmill2 = new Treadmill(4);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Obstruction[] obstructions = {wall1, treadmill1, wall2, treadmill2};

        for (int j = 0; j < sportsmans.length; j++) {
            for (int i = 0; i < obstructions.length; i++) {
                if (obstructions[i] instanceof Wall) {
                    sportsmans[j].jump(((Wall) obstructions[i]).getHeight());
                    if (sportsmans[j].getMaxJump() < ((Wall) obstructions[i]).getHeight()) {
                        break;
                    }
                } else {
                    int a = ((Treadmill) obstructions[i]).getDistance();
                    sportsmans[j].run(a);
                    if (sportsmans[j].getMaxRun() < a) {
                        break;
                    }
                }
            }
        }
    }
}
