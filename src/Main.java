

class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println(brand + " " + model);
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    private int numWheels;
    private boolean hasKickStart;

    public Motorcycle(String brand, String model, int numWheels, boolean hasKickStart) {
        super(brand, model);
        this.numWheels = numWheels;
        this.hasKickStart = hasKickStart;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void performWheelie() {
        System.out.println("Performing a wheelie.");
    }

    public void honkHorn() {
        System.out.println("Honking the horn.");
    }
}

class Bus extends Vehicle {
    private int seatingCapacity;
    private boolean hasAirConditioning;

    public Bus(String brand, String model, int seatingCapacity, boolean hasAirConditioning) {
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
        this.hasAirConditioning = hasAirConditioning;
    }

    public void announceStops() {
        System.out.println("Announcing upcoming stops.");
    }

    public void openDoors() {
        System.out.println("Opening doors for passengers.");
    }
}

class Trailer extends Vehicle {
    private String cargoCapacity;
    private boolean isCovered;

    public Trailer(String brand, String model, String cargoCapacity, boolean isCovered) {
        super(brand, model);
        this.cargoCapacity = cargoCapacity;
        this.isCovered = isCovered;
    }

    public void loadCargo() {
        System.out.println("Loading cargo onto the trailer.");
    }

    public void unloadCargo() {
        System.out.println("Unloading cargo from the trailer.");
    }
}

class Boat extends Vehicle {
    private String length;
    private boolean hasSail;

    public Boat(String brand, String model, String length, boolean hasSail) {
        super(brand, model);
        this.length = length;
        this.hasSail = hasSail;
    }

    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }

    public void sail() {
        System.out.println("Sailing on the water.");
    }

    public void anchor() {
        System.out.println("Dropping anchor to stop the boat.");
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2, true);
        motorcycle.displayInfo();
        motorcycle.startEngine();
        motorcycle.performWheelie();
        motorcycle.honkHorn();
        motorcycle.stopEngine();

        Bus bus = new Bus("Mercedes-Benz", "Sprinter", 20, true);
        bus.displayInfo();
        bus.startEngine();
        bus.announceStops();
        bus.openDoors();
        bus.stopEngine();

        Trailer trailer = new Trailer("Utility", "Flatbed", "5000 lbs", true);
        trailer.displayInfo();
        trailer.startEngine();  // Note: Trailers don't have engines, this is just to show inheritance
        trailer.loadCargo();
        trailer.unloadCargo();

        Boat boat = new Boat("Yamaha", "242X", "24 feet", false);
        boat.displayInfo();
        boat.startEngine();
        boat.sail();
        boat.anchor();
        boat.stopEngine();
    }
}

