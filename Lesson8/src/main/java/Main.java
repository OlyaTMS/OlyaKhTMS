import in.CarImpl;
import model.Car;
import model.Engine;
import model.FuelTank;

public class Main {
    public static void main(String[] args) {


        CarImpl car = new CarImpl(crCar());
        car.carInfo();
        car.startEngine();
        car.startMoving();
        car.showFuelLevel();
        car.refuel();
        car.stopMoving();
        car.stopEngine();
        car.showCurrentDistance();
        car.startEngine();
        car.startMoving();
        car.stopMoving();
        car.stopEngine();
        car.showCurrentDistance();
        car.showTotalDistance();

    }

    private static Car crCar() {
        Car car = new Car(new Engine("petrol", 2400), new FuelTank(50));
        car.setModel("Honda");
        car.setYearOfIssue(2004);
        car.setMaxSpeed(200);
        return car;
    }
}

