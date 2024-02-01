// Main.java
public class MainBlue {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        ElectricBike electricBike = new ElectricBike();

        // Get the battery type for Electric Car
        System.out.println("Electric Car Battery Type: " + electricCar.batteryType());

        // Get the battery type for Electric Bike
        System.out.println("Electric Bike Battery Type: " + electricBike.batteryType());
    }
}
