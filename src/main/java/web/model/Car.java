package web.model;

public class Car {
    private String model;
    private String color;

    public Car() {}

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
