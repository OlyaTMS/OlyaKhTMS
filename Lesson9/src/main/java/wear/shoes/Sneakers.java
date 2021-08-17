package wear.shoes;

import wear.Clothes;
import wear.PartOfWeek;
import wear.Status;

public class Sneakers implements Clothes {
    private final PartOfWeek partOfWeek = PartOfWeek.WEEKEND;
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (partOfWeek == PartOfWeek.WEEKEND && status == Status.OFF) {
            status = Status.ON;
            System.out.println("Кроссовки обуты");
        } else {
            System.out.println("Сегодня нужны босоножки");
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
