import java.util.Vector;

class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}

class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Flight {
    private String flightNumber;
    private String destination;
    private Time departureTime;
    private Time arrivalTime;
    private Vector<Passenger> passengerList;

    public Flight(String flightNumber, String destination, Time departureTime, Time arrivalTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.passengerList = new Vector<>();
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void printInfo() {
        System.out.println("Flight no: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure: " + departureTime.getHour() + ":" + departureTime.getMinute());
        System.out.println("Arrival: " + arrivalTime.getHour() + ":" + arrivalTime.getMinute());
        System.out.println("Number of passengers: " + passengerList.size());
        for (Passenger passenger : passengerList) {
            System.out.println("Passenger: " + passenger.getName() + ", Age: " + passenger.getAge());
        }
    }
}

public class FlightTester {
    public static void main(String arg[]) {
        Time dep = new Time(8, 10);
        Time arr = new Time(9, 0);
        Flight f = new Flight("PK-303", "Lahore", dep, arr);
        Passenger psg1 = new Passenger("Aariz", 30);
        Passenger psg2 = new Passenger("Arsham", 44);
        f.addPassenger(psg1);
        f.addPassenger(psg2);
        f.printInfo();
    }
}
