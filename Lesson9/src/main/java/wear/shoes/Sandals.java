package wear.shoes;

import wear.Clothes;
import wear.PartOfWeek;
import wear.Status;

public class Sandals implements Clothes {
    private final PartOfWeek partOfWeek = PartOfWeek.WEEKEND;
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (partOfWeek == PartOfWeek.WORKING_DAY && status == Status.OFF) {
            status = Status.ON;
            System.out.println("Босоножки обуты");
        } else {
            System.out.println("Сегодня можно обуть кроссовки");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Снимаем кроссовки");
        }
    }
}
