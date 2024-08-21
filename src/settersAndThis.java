class Frog {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}




public class settersAndThis {
    public static void main(String[] args) {

        Frog frog1 = new Frog();

        frog1.setName("Baby Jayy");
        frog1.setAge(22);
    }
}
