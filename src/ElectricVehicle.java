// Abstract class for Electric Vehicles
abstract class ElectricVehicle {
    // Abstract method to get the type of battery
    public abstract String batteryType();
}

// Concrete class representing an Electric Car
class ElectricCar extends ElectricVehicle {
    // Implementation of the abstract method
    @Override
    public String batteryType() {
        return "Lithium-ion Battery";
    }
}

// Concrete class representing an Electric Bike
class ElectricBike extends ElectricVehicle {
    // Implementation of the abstract method
    @Override
    public String batteryType() {
        return "Lead-acid Battery";
    }
}

// Main class to test the implementation

