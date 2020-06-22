package task1;

public class Transport {
    int codeCar;
    int gosNumber;
    int mileage;
    int param;
    private double consumption;
    private double fuelPrice;

    public Transport(int codeCar, int gosNumber, int mileage, int param, double consumption, double fuelPrice) {
        this.codeCar = codeCar;
        this.gosNumber = gosNumber;
        this.mileage = mileage;
        this.param = param;
        this.consumption = consumption;
        this.fuelPrice = fuelPrice;
    }

    public double calcFuel(){
        return (consumption/100)*mileage;
    }

    public double calcExpenses(){
        return (consumption/100)*mileage*fuelPrice;
    }
}
