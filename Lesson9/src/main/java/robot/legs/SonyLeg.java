package robot.legs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Ступает нога Sony");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
