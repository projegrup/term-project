import java.util.ArrayList;
import java.util.PriorityQueue;

public class RentalBranch {
    // branch information
    private String branchName;
    // vehicles
    private ArrayList<Vehicle> vehicles;
    private PriorityQueue<Vehicle> selectedVehicles;


    public RentalBranch(String name, ArrayList<Vehicle> vehicles) {
        setName(name);
        this.vehicles = vehicles;
    }

    // getters
    public String getName() { return branchName; }

    public ArrayList<Vehicle> getVehicles() { return vehicles; }

    public PriorityQueue<Vehicle> getSelectedVehicles(String model) { /* change it with model */ return selectedVehicles; }

    // setters
    public void setName(String name) { branchName = name; }

    public void addVehicle(Vehicle newVehicle) { /*  */ }

    public void removeVehicle(int selectedVehicle) { /* */ }

    public void listVehicles(String model) { /*  */ }



}