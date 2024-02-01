// Interface for Amphibious vehicles
interface Amphibious {
    void dock();
    void launch();
}

// Interface for Air vehicles
interface AirVehicle {
    void takeOff();
    void land();
}

// AmphibiousPlane class implementing both Amphibious and AirVehicle interfaces
class AmphibiousPlane implements Amphibious, AirVehicle {

    @Override
    public void dock() {
        System.out.println("Amphibious Plane is docking on water.");
    }

    @Override
    public void launch() {
        System.out.println("Amphibious Plane is launching from water.");
    }

    @Override
    public void takeOff() {
        System.out.println("Amphibious Plane is taking off into the air.");
    }

    @Override
    public void land() {
        System.out.println("Amphibious Plane is landing on the ground.");
    }
}

// Main class to test the implementation

