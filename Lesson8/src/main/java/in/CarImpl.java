package in;

import model.Car;

public class CarImpl implements ICar {

    private final Car car;
    private final EngineImpl engineImpl;
    private final FuelTankImpl fuelTankImpl;

    public CarImpl(Car car) {
        this.car = car;
        this.engineImpl = new EngineImpl(car.getEngine());
        this.fuelTankImpl = new FuelTankImpl(car.getFuelTank());
    }

    @Override
    public void carInfo() {
        System.out.println(car);
    }

    @Override
    public boolean isMoving() {
        return car.isMoving();
    }

    @Override
    public void startMoving() {
        if (isEngineRunning()) {
            setCarMoving(true);
            System.out.println("Автомобиль поехал");
        } else {
            System.out.println("Заведите двигатель");
        }
    }

    @Override
    public boolean isEngineRunning() {
        return engineImpl.isRunning();
    }

    @Override
    public void startEngine() {
        if (!isEngineRunning() && !isFuelEmpty()) {
            engineImpl.start();
        } else if (isEngineRunning()) {
            System.out.println("Двигатель уже работает");
        } else if (isFuelEmpty()) {
            System.out.println("Нужно заправиться");
        }
    }

    @Override
    public void stopEngine() {
        if (isEngineRunning() && !isMoving()) {
            engineImpl.stop();
        } else if (!isEngineRunning()) {
            System.out.println("Двигатель не работает");
        } else if (!isMoving()) {
            System.out.println("Нужно остановиться");
        }
    }

    @Override
    public void stopMoving() {
        if (isMoving()) {
            setCarMoving(false);
            System.out.println("Автомобиль остановился");
            int time = (int) (Math.random() * 12);
            int currentSpeed = (int) (Math.random() * car.getMaxSpeed());
            int distance = currentSpeed * time;
            car.setDistance(distance);
            updateTotalDistance(distance);
        }
    }

    @Override
    public boolean isFuelEmpty() {
        return fuelTankImpl.isEmpty();
    }

    @Override
    public void showFuelLevel() {
        System.out.println("Текущий уровень топлива: " + fuelTankImpl.getFuelLevel() + " л.");
    }

    @Override
    public void refuel() {
        System.out.println("Заправили " + fuelTankImpl.refuel() + " л.");
    }

    @Override
    public void showCurrentDistance() {
        System.out.println("Последняя поездка: " + car.getDistance() + " км");
    }

    @Override
    public void showTotalDistance() {
        System.out.println("Общий пробег автомобиля: " + car.getTotalDistance() + " км");
    }

    private void updateTotalDistance(int distance) {
        car.setTotalDistance(car.getTotalDistance() + distance);
    }

    private void setCarMoving(boolean isMove) {
        car.setMoving(isMove);
    }
}
