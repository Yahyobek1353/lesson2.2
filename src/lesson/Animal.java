package lesson;

public abstract class Animal implements Drowble {
    public Animal(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
