class Dog {
    private int id;
    private String name;

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}


public class theToStringMethod {
    public static void main(String[] args) {
        Dog dog1 = new Dog(24, "Jack");
        Dog dog2 = new Dog(4, "Henry");

        System.out.println(dog1);
        System.out.println(dog2);
    }
}