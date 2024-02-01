// MainTest.java
public class MainTest {
    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();

        // Using Amphibious interface methods
        amphibiousPlane.dock();
        amphibiousPlane.launch();

        // Using AirVehicle interface methods
        amphibiousPlane.takeOff();
        amphibiousPlane.land();
    }
}
