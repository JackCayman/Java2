package Lesson1;

public class CompUser  extends User{
    private int id;

    public CompUser(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    protected void doAction() {
        System.out.println("123");
    }
}
