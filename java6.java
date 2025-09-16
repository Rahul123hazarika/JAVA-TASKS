// 6.	Abstract Classes: Create an abstract class Ticket with an abstract method getPrice() and implement it in BusTicket and TrainTicket classes. 

// Abstract class Ticket
abstract class Ticket {
    protected String passengerName;
    protected String source;
    protected String destination;

    // Constructor
    public Ticket(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double getPrice();

    // Common method for all tickets
    public void printTicketInfo() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + source + " To: " + destination);
        System.out.println("Ticket Price: " + getPrice());
    }
}

// Concrete class BusTicket
class BusTicket extends Ticket {
    private double distance; // in km
    private double ratePerKm = 1.5; // Bus rate

    public BusTicket(String passengerName, String source, String destination, double distance) {
        super(passengerName, source, destination);
        this.distance = distance;
    }

    // Implement abstract method
    @Override
    public double getPrice() {
        return distance * ratePerKm;
    }
}

// Concrete class TrainTicket
class TrainTicket extends Ticket {
    private double distance; // in km
    private double ratePerKm = 1.0; // Train rate
    private double reservationFee = 50; // Fixed reservation charge

    public TrainTicket(String passengerName, String source, String destination, double distance) {
        super(passengerName, source, destination);
        this.distance = distance;
    }

    // Implement abstract method
    @Override
    public double getPrice() {
        return (distance * ratePerKm) + reservationFee;
    }
}

// Main class to test tickets
class TicketSystem {
    public static void main(String[] args) {
        // Create a Bus Ticket
        Ticket busTicket = new BusTicket("Rahul", "Delhi", "Agra", 200);
        busTicket.printTicketInfo();

        System.out.println();

        // Create a Train Ticket
        Ticket trainTicket = new TrainTicket("Amit", "Delhi", "Mumbai", 1400);
        trainTicket.printTicketInfo();
    }
}
