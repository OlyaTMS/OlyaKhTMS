package cosmos;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(25) % 2 == 0;
    }

    @Override
    public void engineStart() {
        System.out.println("\"Двигатели SpaceX запущены. Все системы в норме.\"");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
