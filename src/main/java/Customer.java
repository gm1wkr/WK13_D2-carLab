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

    private boolean canPay(double amountToPay) {
        return this.getMoney() >= amountToPay;
    }

    public boolean payMoney(double amountToPay){
        if(this.canPay(amountToPay)){
           this.setMoney(getMoney() - amountToPay);
           return true;
        }
        return false;
    }
}
