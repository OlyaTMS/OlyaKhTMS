package tr1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tr.Transport;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class LandTransport extends Transport {
    private int numbersOfWheels;
    private double fuel;

}
