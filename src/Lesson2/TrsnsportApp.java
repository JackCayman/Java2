package Lesson2;

public class TrsnsportApp {
    public static void main(String[] args) {
        Transport[]transports = new Transport[]{new Cater(),new Ship(),new Bus()};
        for (Transport transport : transports) {
            transport.load();

            if (transport instanceof Swimmable){
                System.out.println("Эта штука плавает");
                Swimmable swimmable = (Swimmable)transport;
                swimmable.swim();
            }

            if (transport instanceof Bus){
                Bus bus =(Bus)transport;
                System.out.println("Машрут" + bus.getMarshrut());
            }
        }
    }
}
