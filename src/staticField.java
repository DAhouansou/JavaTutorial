class Thing {
    public final static int LUCKYNUMBER = 94;
    public String name;
    public static String description;

    public static int count = 0;

    public int id;

    public Thing() {

        id = count;
        count++;
    }



    public void showName() {
        System.out.println("Object id: " +id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}




public class staticField {
    public static void main(String[] args) {

        Thing.description = "I am a skibidi thing";

        System.out.println((Thing.description));

        Thing.showInfo();

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Kai";
        thing2.name = "Cenat";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKYNUMBER);
        System.out.println(Thing.count);
    }
}
