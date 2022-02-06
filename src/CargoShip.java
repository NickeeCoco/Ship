public class CargoShip extends Ship {
    private int cargoCapacity; // in tonnage

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "The ship " + this.getName() + " can hold " + cargoCapacity + " tons of cargo.";
    }
}
