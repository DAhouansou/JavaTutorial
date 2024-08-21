package implementingIterable;

public class App {
    public static void main(String[] args) {

        URLLibrary urlLibrary = new URLLibrary();

        for(String html: urlLibrary) {
            System.out.println(html.length());
            System.out.println(html);
        }
    }
}
