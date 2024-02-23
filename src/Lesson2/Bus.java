package Lesson2;

public class Bus extends Transport {
    String marshrut;

    public String getMarshrut() {
        return marshrut;
    }

    public void setMarshrut(String marshrut) {
        this.marshrut = marshrut;
    }

    @Override
    void load() {
        System.out.println("Люди садятся в автобус");
    }
}
