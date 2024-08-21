package enumTypes;


public class App {

    public static void main(String[] args) {
        Animal animal = Animal.cat;

        switch (animal){
            case cat:
                System.out.println("Cat");
                break;
            case dog:
                System.out.println("Dog");
                break;
            case mouse:
                System.out.println("Mouse");
                break;
            default:
                break;
        }

        System.out.println(Animal.dog);
        System.out.println("Enum name as a string " + Animal.dog.name());

        System.out.println(Animal.dog.getClass());

        System.out.println(Animal.dog instanceof Enum);

        System.out.println(Animal.mouse.getName());

        Animal anima2 = Animal.valueOf("cat");

        System.out.println(anima2);
    }
}
