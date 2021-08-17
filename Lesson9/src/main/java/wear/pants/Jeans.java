package wear.pants;

import wear.Clothes;
import wear.PartOfWeek;
import wear.Status;

public class Jeans implements Clothes {
    private final PartOfWeek partOfWeek = PartOfWeek.WEEKEND;
    private Status status = Status.OFF;


    @Override
    public void putOn() {
        if (partOfWeek == PartOfWeek.WEEKEND && status == Status.OFF) {
            status = Status.ON;
            System.out.println("Джинсы надеты");
        } else {
            System.out.println("Сегодня нужны брюки");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Снимаем джинсы");
        }
    }
}
