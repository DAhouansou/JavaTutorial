import java.util.Scanner;

public class switchVariable {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command");
        String line = input.nextLine();

        switch (line){
            case "Start":
                System.out.println("The system has started");
                break;

            case "Stop":
                System.out.println("System has stopped");
                break;

            default:
                System.out.println("Command not recognized");
        }
    }
}
