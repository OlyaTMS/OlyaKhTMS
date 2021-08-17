package wear.jacket;

import lombok.Getter;
import lombok.Setter;
import wear.Clothes;
import wear.PartOfWeek;
import wear.Status;

@Getter
@Setter

public class Blouse implements Clothes {
    private final PartOfWeek partOfWeek = PartOfWeek.WEEKEND;
    private Status status = Status.OFF;

    @Override
    public void putOn() {
        if (partOfWeek == PartOfWeek.WORKING_DAY && status == Status.OFF) {
            status = Status.ON;
            System.out.println("Блуза надета");
        } else {
            System.out.println("Сегодня можно надеть пуловер");
        }
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Снимаем блузу");
        }
    }
}
