package Task26_z21;

import java.awt.*;

public class Car {
    private String make;
    private Color color;

    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    public Car(String make, int color1, int color2, int color3) {
        this.make = make;
        this.color = new Color(color1, color2, color3);
    }

    public String getMake() {
        return make;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return make + " " + color.toString();
    }
}
