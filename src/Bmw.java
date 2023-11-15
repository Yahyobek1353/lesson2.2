public class Bmw extends Car{
    private String type;
    public Bmw(String name, int egine, int year, String type) {
        super(name, egine, year);
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Данные Машины ---------------------\n" +
                 "type" + type);
    }
}
