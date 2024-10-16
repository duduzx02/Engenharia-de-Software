package Interface;

public class Main {
    public static void main(String[] args) {
        Vehicle tesla = new Car();

        tesla.start();
        tesla.stop();
        tesla.accelerate();


        Starter.startEngine(tesla);
    }
}
