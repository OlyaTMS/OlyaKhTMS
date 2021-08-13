package cosmos;

public class Main {
    public static void main(String[] args) {
        SpaceStation america = new SpaceStation();
        IStart[] spaceShips = {new Shuttle(), new SpaceX()};
        for (IStart spaceShip : spaceShips) {
            america.starting(spaceShip);
        }
    }
}
