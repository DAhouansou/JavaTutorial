package interfaces;

public class person implements Info{

    private String name;

    public person(String name) {
        this.name=name;
    }

    public void greet() {
        System.out.println("Hello there!");
    }

    public void showInfo() {
        System.out.println("Person name is " + name);
    }
}
