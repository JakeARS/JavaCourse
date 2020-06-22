package task1;

public class Cargo extends Transport {
    private static double consumption = 12.0;
    private static double fuelPrice = 48.9;

    public Cargo(int codeCar, int gosNumber, int mileage, int param) {
        super(codeCar, gosNumber, mileage, param, consumption, fuelPrice);
    }
}
