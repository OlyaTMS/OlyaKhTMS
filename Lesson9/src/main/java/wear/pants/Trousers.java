package wear.pants;

import wear.Clothes;
import wear.PartOfWeek;
import wear.Status;

public class Trousers implements Clothes {
    private final PartOfWeek partOfWeek = PartOfWeek.WEEKEND;
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (partOfWeek == PartOfWeek.WORKING_DAY && status == Status.OFF) {
            status = Status.ON;
            System.out.println("Брюки надеты");
        } else {
            System.out.println("Сегодня можно надеть джинсы");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Снимаем брюки");
        }
    }
}
