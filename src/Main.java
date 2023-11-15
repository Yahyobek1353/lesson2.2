import lesson.*;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("круг", 12);
        Triangle t1 = new Triangle("Триугольник",5,7,3);
        Square s1 = new Square("Квадрат",15);
        Rectangle r1 = new Rectangle("прямоугольник" , 9,15);
        Dog dog = new Dog("Barsik");
        Cat cat = new Cat("Bagira");
        //полиморфизм
        Drowble[] drowbles = {c1,t1,s1,r1,dog,cat };
        for (int i = 0; i < drowbles.length; i++) {
            if (drowbles[i] instanceof Figure) {
                System.out.println(((Figure) drowbles[i]).getName() + " Параметр -> " + ((Figure) drowbles[i]).colculatePerimeter());
            }
            if (drowbles[i] instanceof Animal){
                System.out.println(((Animal)drowbles[i]).getName());
            }
            drowbles[i].draw();

        }

    }
    public Car createObject(String className){
        Car[] cars = {new Bmw("M5",5,2023,"drift car"),
                new Tayota("auris",3,2021,4,"city car"),
                new Nissan("juke",5,2023,"drift car",4)};
        for (int i = 0; i < cars.length; i++) {
            switch (className instanceof Bmw);
        }


        return null;
    }
}