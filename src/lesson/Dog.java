package lesson;

import lesson.Animal;

public class Dog extends Animal implements Drowble {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83E\uDDAE");
    }
}
