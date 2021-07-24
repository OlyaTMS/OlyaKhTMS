package airtr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tr1.AirTransport;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Civil extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;
    int countPeople = (int) (Math.random() * 650);

    public void checkNumberOfPassengers(int numberOfPassengers, int countPeople) {
        if (countPeople <= numberOfPassengers) {
            System.out.println("Самолет заполнен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public void isBusinessClassAvailability() {
        if (countPeople > 300) {
            System.out.println("В самолете есть бизнесс класс");
        }
    }
}
