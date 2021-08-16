package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class FuelTank {
    private int fuelCapacity;
    private int fuelLevel;

    public FuelTank(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
