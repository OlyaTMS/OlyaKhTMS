package landtr;

import in.Convertible;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tr1.LandTransport;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Cars extends LandTransport implements Convertible {
    private String typeOfCarcase;
    private int numberOfPassengers;

    public double distance(Cars cars, double time) {
        return cars.getMaxSpeed() * time;
    }

    private double calculateFuel(Cars cars, double time) {
        return distance(cars, time) * getFuel() / 100;
    }

    public void carsInfo(Cars cars, double time) {
        System.out.println("За время " + time + " ч, автомобиль " + getModel() + ", двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч, проедет " + distance(cars, time) + " км и израсходует " + calculateFuel(cars, time) + " литров топлива.");
    }
}
