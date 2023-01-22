import java.util.ArrayList;


public class Train {
    private ArrayList<Wagon> wagons;
    private int maxWagon;
    private String name;
    private int id = 1;
    private ArrayList<Passenger> passengers;

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }
    public Wagon getWagon(int index){
        return wagons.get(index);
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
        for(Wagon wagon : this.wagons){
            wagon.setId(id);
            id++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setMaxVagon(int maxVagon) {
        this.maxWagon = maxVagon;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setMaxWagon(int maxWagon) {
        this.maxWagon = maxWagon;
    }

    public int getMaxWagon() {
        return maxWagon;
    }



}