package Model;

public class Car {
    private String brand;
    private String carModel;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.carModel = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setModel(String model) {
        this.carModel = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

