import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String line = input.nextLine();

        System.out.println("Have a good day " + line);
    }


}
