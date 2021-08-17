package wear;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter


public class Person {
    private String name;
    private List<Clothes> clothes;

    public Person(String name, List<Clothes> clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    void putOnClothes() {
        for (Clothes clothes : clothes) {
            clothes.putOn();
        }
    }

    void takeOffClothes() {
        for (Clothes clothes : clothes) {
            clothes.takeOff();
        }
    }
}
