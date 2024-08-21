package multipleExceptions;

import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        Test test = new Test();

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Coulndn't parse command file");
        }
        */

        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */
        try {
            test.run();
        } catch (Exception x) {
            x.printStackTrace();
        }

        test.input();
    }
}
