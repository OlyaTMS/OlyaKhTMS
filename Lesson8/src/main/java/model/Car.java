package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Car {
    private final Engine engine;
    private FuelTank fuelTank;
    private boolean isMoving;
    private String model;
    private int yearOfIssue;
    private int distance;
    private int totalDistance;
    private int maxSpeed;

    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }
}
