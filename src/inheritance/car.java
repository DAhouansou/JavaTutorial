package inheritance;

public class car extends machine {


    @Override
    public void start() {
        super.start();
    }

    public void stop() {
        System.out.println("Car is stopping");
    }

    public void turnCar() {
        System.out.println("Car is turning");
    }
}
