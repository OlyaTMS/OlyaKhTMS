package in;

import lombok.Getter;
import lombok.Setter;
import model.FuelTank;

@Getter
@Setter
public class FuelTankImpl implements IFuel {

    private FuelTank fuelTank;

    public FuelTankImpl(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public boolean isEmpty() {
        return getFuelLevel() == 0;
    }

    @Override
    public int getFuelLevel() {
        fuelTank.setFuelLevel((int) (Math.random() * fuelTank.getFuelCapacity()));
        return fuelTank.getFuelLevel();
    }

    @Override
    public int refuel() {
        return fuelTank.getFuelCapacity() - fuelTank.getFuelLevel();
    }
}
