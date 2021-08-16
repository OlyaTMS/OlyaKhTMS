package in;

public interface ICar {
    void carInfo();

    boolean isMoving();

    void startMoving();

    boolean isEngineRunning();

    void startEngine();

    void stopEngine();

    void stopMoving();

    boolean isFuelEmpty();

    void showFuelLevel();

    void refuel();

    void showCurrentDistance();

    void showTotalDistance();
}
