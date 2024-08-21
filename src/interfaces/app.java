package interfaces;

public class app {
    public static void main(String[] args) {
        machine mach1 = new machine();
        mach1.start();

        person person1 = new person("Ryan");
        person1.greet();

        Info info1 = new machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();
        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
