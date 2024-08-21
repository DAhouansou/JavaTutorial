import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int wanted = 10;

        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a new number");
            int num = input.nextInt();

            if (num == wanted){
                System.out.println("Thats the correct number!!");
                break;
            }


        }
    }
}
