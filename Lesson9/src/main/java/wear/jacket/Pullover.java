package wear.jacket;

import wear.Clothes;
import wear.PartOfWeek;
import wear.Status;

public class Pullover implements Clothes {
    private final PartOfWeek partOfWeek = PartOfWeek.WEEKEND;
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (partOfWeek == PartOfWeek.WEEKEND && status == Status.OFF) {
            status = Status.ON;
            System.out.println("Пуловер надет");
        } else {
            System.out.println("Сегодня нужна блуза");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Снимаем пуловер");
        }
    }
}
