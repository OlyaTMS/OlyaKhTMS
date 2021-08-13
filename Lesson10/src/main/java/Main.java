public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Honda", 220, 18000);
        Car car2 = new Car("Toyota", 200, 21000);
        Car car3 = new Car("Audi", 240, 27000);
        Car car4 = new Car("Lada", 170, 14000);

        try {
            car1.start();
            car2.start();
            car3.start();
            car4.start();
        } catch (Exception MyException) {
            System.out.println(MyException.getMessage());
            MyException.printStackTrace();
        }
    }
}
