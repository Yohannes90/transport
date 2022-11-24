import java.util.Arrays;

public class Passenger {
    String[] passengerList;
    int capacity;

    void transportCapacity() {
        passengerList = new String[capacity];
    }

    void addPassenger(int ticketNumber, String passengerName) {
        passengerList[ticketNumber] = passengerName;
        System.out.println(passengerName + " have a reserved ticket!");
    }

    void viewTotalPassengers() {
        System.out.println("List of passenger names: " + Arrays.toString(passengerList));
    }

    void removePassenger(int ticketNumber) {
        passengerList[ticketNumber] = null;
        System.out.println("Passenger reservation removed successfully!");
    }

    void updatePassenger(int ticketNumber, String passengerName) {
        passengerList[ticketNumber] = passengerName;
        System.out.println("Passenger reservation added successfully!");
    }

    int totalPassenger() {
        return passengerList.length;
    }

}
