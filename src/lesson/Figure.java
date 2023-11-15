package lesson;

import lesson.Drowble;

public abstract class Figure implements Drowble {
    private String name;
    public abstract int colculatePerimeter();

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
