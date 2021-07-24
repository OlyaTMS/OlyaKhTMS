package service;

import airtr.Civil;
import airtr.Military;
import landtr.Cars;
import landtr.Trucks;
import tr.Transport;

public class Main {
    public static void main(String[] args) {
        Transport cars = Cars.builder()
                .power(100)
                .maxSpeed(120)
                .weight(180)
                .model("Honda")
                .numbersOfWheels(4)
                .fuel(8)
                .typeOfCarcase("hb")
                .numberOfPassengers(5)
                .build();

        Transport trucks = Trucks.builder()
                .power(180)
                .maxSpeed(120)
                .weight(2800)
                .model("Iveco")
                .numbersOfWheels(6)
                .fuel(200)
                .liftingCapacity(3800)
                .build();

        Transport civil = Civil.builder()
                .power(350)
                .maxSpeed(800)
                .weight(4000)
                .model("Aeroflot")
                .wingspan(100)
                .minRunwayLength(500)
                .numberOfPassengers(800)
                .build();

        Transport military = Military.builder()
                .power(400)
                .maxSpeed(1000)
                .weight(3000)
                .model("Fighter")
                .wingspan(80)
                .minRunwayLength(350)
                .numberOfRockets(10)
                .build();


        System.out.println(cars);
        System.out.println(trucks);
        System.out.println(civil);
        int countPeople = (int) (Math.random() * 650);
        ((Civil)civil).checkNumberOfPassengers(countPeople);

        System.out.println(military);

    }
}
