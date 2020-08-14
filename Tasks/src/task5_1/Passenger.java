package task5_1;

public class Passenger extends Transport {
    private static double consumption = 11.5;
    private static double fuelPrice = 47.5;

    public Passenger(int codeCar, int gosNumber, int mileage, int param) {
        super(codeCar, gosNumber, mileage, param, consumption, fuelPrice);
    }
}