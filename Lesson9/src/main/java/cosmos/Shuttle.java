package cosmos;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(11) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("\"Двигатели Шаттла запущены. Все системы в норме.\"");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");

    }
}
