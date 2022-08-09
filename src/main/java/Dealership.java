import java.util.ArrayList;

public class Dealership {
    private double till;
    private ArrayList<Vehicles> ownedVehicles;

    public Dealership(double till) {
        this.till = till;
        this.ownedVehicles = new ArrayList<>();
    }

    public void addToOwned(Vehicles vehicle) {
        this.ownedVehicles.add(vehicle);
    }

    public int numberOfCarsOwned() {
        return this.ownedVehicles.size();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicles> getOwnedVehicles() {
        return ownedVehicles;
    }
}
