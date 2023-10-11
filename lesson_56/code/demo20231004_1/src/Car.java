package demo20231004_1.src;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
