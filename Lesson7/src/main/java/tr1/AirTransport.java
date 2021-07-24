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

public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLength;
}
