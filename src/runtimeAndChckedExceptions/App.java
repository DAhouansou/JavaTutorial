package runtimeAndChckedExceptions;

public class App {
    public static void main(String[] args) {


        String[] texts = {"one", "two", "three"};
        try {
            System.out.println(texts[3]);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}
