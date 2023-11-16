public class Tayota extends Car {
    private int wheel;
    private String type;


    public Tayota(String name, int egine, int year,int wheel, String type) {
        super(name, egine, year );
        this.wheel = wheel;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Данные Машины ---------------------\n" +
                "wheel" + " " + wheel + "\n" + "type" + " " + type);
    }
}
