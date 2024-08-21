class AnotherPerson {
    String name;
    int age;

  void speak() {
       System.out.println("My name is " + name + ", i am " + age + " years old.");
   }
    int yearsLeftUntilRetire() {
        int yearsleft = 67 - age;

        return yearsleft;
    }

    int getAge() {
      return age;
    }

    String getName() {
      return name;
    }
}




public class gettersAndReturnValues {


    public static void main(String[] args) {
        AnotherPerson person1 = new AnotherPerson();

        person1.name = "Kai Cenat";
        person1.age = 24;

        person1.speak();

        int years = person1.yearsLeftUntilRetire();
        System.out.println("I can retire in " + years + " years");

        int age = person1.getAge();
        System.out.println(age);

        String name = person1.getName();
        System.out.println(name);

    }
}
