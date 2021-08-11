package cosmos;

public class SpaceStation {
    //    @SneakyThrows
    public void starting(IStart spaceShip) {
        if (!spaceShip.checkSystem()) {
            System.out.println("Предстартовая проверка провалена.");
        } else {
            spaceShip.engineStart();
            System.out.println("Запуск двигателей через ...");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            spaceShip.start();
        }
    }
}
