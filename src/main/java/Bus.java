import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String desination, Integer capacity){
        this.destination = desination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public int passengerCount() {
        return this.passengers.size();
    }


    public void addPassenger(Person person) {
        if (this.passengers.size() <= this.capacity) {
            this.passengers.add(person);
        }
    }

    public Person removePassenger(Person person) {
        return this.passengers.remove(0);
    }
}
