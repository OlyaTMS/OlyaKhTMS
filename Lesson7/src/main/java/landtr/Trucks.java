package landtr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tr1.LandTransport;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Trucks extends LandTransport {
    private double liftingCapacity;

    public void checkLiftingCapacity(double liftingCapacity) {
        double weightOfCargo = Math.random() * 4500;
        if (weightOfCargo <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
