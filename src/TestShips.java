import java.util.ArrayList;

public class TestShips {

    public static void main(String[] args) {
        ArrayList<Ship> ships = new ArrayList<Ship>();

        Ship ship1 = new CargoShip("Adam", "2010", 25);
        Ship ship2 = new Ship("Bernadette", "1988");
        Ship ship3 = new Ship("Charlie", "2012");
        Ship ship4 = new CruiseShip("Diana", "2002", 2540);
        Ship ship5 = new CargoShip("Elias", "1967", 65);
        Ship ship6 = new CruiseShip("Ferdinand", "2020", 5555);
        Ship ship7 = new Ship("Georgia", "1999");
        Ship ship8 = new CruiseShip("Henry", "1888", 200);
        Ship ship9 = new CargoShip("Iris", "2001", 250);
        Ship ship10 = new CruiseShip("Julius", "1987", 15);

        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);
        ships.add(ship4);
        ships.add(ship5);
        ships.add(ship6);
        ships.add(ship7);
        ships.add(ship8);
        ships.add(ship9);
        ships.add(ship10);

        System.out.println(ships);

    }

}
