import java.util.ArrayList;

public class Customer{

    private double money;
    private ArrayList<Vehicles> ownedVehicles;


    public Customer(double money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicles> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void addToOwned(Vehicles vehicle){
        this.ownedVehicles.add(vehicle);
    }

    public int numberOfCarsOwned() {
        return this.ownedVehicles.size();
    }
}
