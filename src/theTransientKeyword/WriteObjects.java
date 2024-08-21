package theTransientKeyword;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");

        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("text.ser"))) {

            Person person = new Person(7, "Jim");
            Person.setCount(88);
            os.writeObject(person);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
