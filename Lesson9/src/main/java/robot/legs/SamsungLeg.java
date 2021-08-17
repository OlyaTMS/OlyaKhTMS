package robot.legs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Ступает нога Samsung");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
