package Lesson1;

public class ComputerUser extends User {

    private int iq;

    public ComputerUser(int id, String name) {
        super(id, name);
    }

    public ComputerUser(int id) {
        super(id);
    }

    @Override
    public void doAction() {

    }

    public int getIq() {
        return iq;
    }
}
