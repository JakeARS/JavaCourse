package task5_1;

public class Light extends Transport {
    private static double consumption = 12.5;
    private static double fuelPrice = 46.1;
    private static int param = 0;

    public Light(int codeCar, int gosNumber, int mileage) {
        super(codeCar, gosNumber, mileage, param, consumption, fuelPrice);
    }
}