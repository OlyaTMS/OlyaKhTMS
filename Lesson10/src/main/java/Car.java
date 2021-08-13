import java.util.Random;

public class Car implements IStart {
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void start() throws Exception {
        Random random = new Random();
        int number = random.nextInt(21);
        if (number % 2 != 0) {
            System.out.println("Машина " + model + " завелась. Поехали!");
        } else {
            throw new MyException("Машина " + model + " не завелась. Попробуем еще раз!");
        }
    }
}
