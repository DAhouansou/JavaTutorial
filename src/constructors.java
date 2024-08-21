import javax.crypto.Mac;
import java.util.Scanner;

class Machine {
    private String name;
    private int value;



    public Machine() {
        this("Arnie", 0);
        System.out.println("Constructor running");
    }

    public Machine(String name) {

        System.out.println("2nd constructor running");
        this.name = name;
    }

    public Machine(int name) {

        System.out.println("3rd constructor running");
        this.value = value;
    }

    public Machine(String code, int num) {

        System.out.println("3rd constructor running");

    }



}



public class constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        Machine machine2 = new Machine("line");

        Machine machine3 = new Machine(3432);

        Machine machine4 = new Machine("BBC", 3432);
    }
}
