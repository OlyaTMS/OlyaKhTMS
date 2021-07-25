package robot.hands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
