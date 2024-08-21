package labmdaExpressions;

interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block...");
        int value = e.execute(12, 13);
        System.out.println("Return value is " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Executing code block...");
        int value = e.execute("I am the String Executable");
        System.out.println("Return value is " + value);
    }


}

////////////////////////////These are lambda classes////////////////////////////////
        /*
        runner.run(() -> {

            System.out.println("This is code passed in a lambda expression");
            System.out.println("Hello there");

        });

===================================================================================

        runner.run(() -> {

            System.out.println("This is code passed in a lambda expression");
            System.out.println("Hello there");
            return 8;
        });

===================================================================================

        runner.run(() -> {
            return 8;
        });

===================================================================================

        runner.run(() -> 8);

===================================================================================

        runner.run((int a) -> {
            System.out.println("Hello there");
            return 7 + a;
        });

===================================================================================

        runner.run((a) -> {
            System.out.println("Hello there");
            return 7 + a;
        });

===================================================================================

         runner.run( a -> {
            System.out.println("Hello there");
            return 7 + a;
        });
===================================================================================

runner.run((a, b)  -> {
            System.out.println("Hello there");
            return 7 + a;
        });

===================================================================================

         */
///////////////////////////////////////////////////////////////////////////////////

public class App {
    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new Executable() {
            public int execute(int a, int b) {
                System.out.println("Hello there");
                return 7 + a;
            }
        });

        System.out.println("=================================");

        runner.run((a, b)  -> {
            System.out.println("Hello there");
            return 7 + a;
        });



    }
}
