package inheritance;

public class inheritance {
    public static void main(String[] args) {
        machine mach1 = new machine();

        mach1.start();
        mach1.stop();

        car car1 = new car();

        car1.start();
        car1.stop();
        car1.turnCar();
    }
}
