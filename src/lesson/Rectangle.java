package lesson;

import lesson.Drowble;
import lesson.Figure;

public class Rectangle extends Figure implements Drowble {
    private int side1;
    private int side2;
    public Rectangle(String name, int side1,int side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {
        System.out.println("▭");
    }

    @Override
    public int colculatePerimeter() {
        return  2* (side1 + side2);
    }
}
