package interfaces;

public class machine implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Machine has started.");
    }

    public void showInfo() {
        System.out.println("Machine ID is " + id);
    }
}
