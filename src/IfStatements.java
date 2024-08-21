public class IfStatements {
    public static void main(String[] args) {


        for(int num = 0; num < 1000000; num++){

            System.out.println(num);
            if(num == 27) {
                System.out.print("This is the end");
                break;
            }
            else if (num % 2 == 1) {
                System.out.println("skibidi");
            }
        }



    }
}
