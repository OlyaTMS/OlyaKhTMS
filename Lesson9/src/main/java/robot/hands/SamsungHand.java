package robot.hands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }


    @Override
    public void upHand() {
        System.out.println("Поднята рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
