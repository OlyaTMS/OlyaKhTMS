package landtr;

import in.Convertable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tr.Transport;
import tr1.LandTransport;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Cars extends LandTransport implements Convertable {
    private String typeOfCarcase;
    private int numberOfPassengers;

    public double distance(Cars cars, double time) {
        return cars.getMaxSpeed() * time;
    }

    private double calculateFuel(Cars cars, double time) {
        return distance(cars, time) * getFuel() / 100;
    }

    public void carsInfo(Transport transport, double time) {
        Cars cars = (Cars) transport;
        System.out.println("За время" + time + " ч, автомобиль" + cars.getModel() + " ,двигаясь с максимальной скоростью" + cars.getMaxSpeed() + " км/ч, проедет" + cars.distance(cars, time) + " км и израсходует" + cars.calculateFuel(cars, time) + " литров топлива.");
    }
}
