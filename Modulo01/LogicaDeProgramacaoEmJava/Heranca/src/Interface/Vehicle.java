package Interface;

public interface Vehicle {
    public String licensePlate = "";

    public void start();

    public void stop();

    default void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Truck implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting truck engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck engine...");
    }
}

class Starter{
    public static void startEngine(Vehicle vehicle){
        vehicle.start();
    }
}


