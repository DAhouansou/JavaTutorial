package enumTypes;

public enum Animal {
    cat("Tom"),dog("Cupcake"),mouse("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This animal is called: " + name;
    }
}
