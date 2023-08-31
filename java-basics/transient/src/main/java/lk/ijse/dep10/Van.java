package lk.ijse.dep10;

import java.io.Serializable;
import java.util.SplittableRandom;

public class Van implements Serializable {
    transient String model;
    String color;

    public Van(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Van{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
