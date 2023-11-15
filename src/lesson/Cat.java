package lesson;

import lesson.Animal;

public class Cat extends Animal implements Drowble {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }
}
