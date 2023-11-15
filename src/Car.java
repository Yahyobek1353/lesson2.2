public abstract class Car implements Printable {
    public Car(String name, int egine, int year) {
        this.name = name;
        this.egine = egine;
        this.year = year;
    }

    private String name;
    private double egine;
    private int year;//год выпуска

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEgine() {
        return egine;
    }

    public void setEgine(int egine) {
        this.egine = egine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
