package lesson;

import lesson.Figure;

public class Square extends Figure {
    private int side;
    public Square(String name,int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int colculatePerimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("⬜");
    }
}
