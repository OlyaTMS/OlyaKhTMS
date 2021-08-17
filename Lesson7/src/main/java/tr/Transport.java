package tr;

import in.Convertible;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder

public abstract class Transport implements Convertible {
    private double power;
    private double maxSpeed;
    private double weight;
    private String model;

    @Override
    public String toString() {
        return "Transport{" + "power=" + getPower(power) + ", maxSpeed=" + maxSpeed + ",weight=" + weight + ",model=" + model + '\'' + '}';
    }
}