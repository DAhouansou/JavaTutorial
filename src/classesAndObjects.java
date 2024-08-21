class Person {
 // classes can contain:
 //1. data
 //2. Subroutines(methods)

 String name;
 int age;

 void speak(){
     System.out.println("My name is " + name + ", i am " + age + " years old.");
 }
}


public class classesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Mr Beast";
        person1.age = 27;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Vladamir Putin";
        person2.age = 62;
        person2.speak();

    }
    public static void other(String[] args) {

    }
}
