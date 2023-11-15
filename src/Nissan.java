public class Nissan extends Car{
    private String type;
    private int wheel;
    public Nissan(String name, int egine, int year,String type,, int wheel) {
        super(name, egine, year);
        this.type = type;

        this.wheel = wheel;
    }

    @Override
    public void print() {
        System.out.println("Данные Машины ---------------------\n" +
                "type" + type + "\n" +
                "wheel" + wheel);
    }
}
