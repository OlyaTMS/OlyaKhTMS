package robot.hands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
