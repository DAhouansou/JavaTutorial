package theEqualsMethod;


import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" +id + ",name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


}

public class App {
    public static void main(String[] args) {

        System.out.println();

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");

        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1.equals(value2));

        Integer num1 = 6;
        Integer num2 = 6;

        System.out.println(num1 == num2);

        String text1 = "Hello";
        String text2 = "Hellosfdgdsg".substring(0,5);

        System.out.println(text2);

        System.out.println(text1.equals(text2));
    }
}
