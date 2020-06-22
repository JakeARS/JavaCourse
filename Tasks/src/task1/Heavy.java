package task1;

public class Heavy extends Transport {
    private static double consumption = 20.0;
    private static double fuelPrice = 48.9;

    public Heavy(int codeCar, int gosNumber, int mileage, int param) {
        super(codeCar, gosNumber, mileage, param, consumption, fuelPrice);
    }
}
