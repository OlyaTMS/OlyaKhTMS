package airtr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tr.Transport;
import tr1.AirTransport;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Military extends AirTransport {
    private boolean ejectionSystem;
    private int numberOfRockets;

    public void shot() {
        if (numberOfRockets != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult(Transport transport) {
        Military military = (Military) transport;
        if (military.isEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

}
