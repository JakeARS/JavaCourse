package task3_1;

public interface Transport3_1 {
    /*int codeCar;
    int gosNumber;
    int mileage;
    int param;
    private double consumption;
    private double fuelPrice;*/

    /*public Transport3_1(int codeCar, int gosNumber, int mileage, int param, double consumption, double fuelPrice) {
        this.codeCar = codeCar;
        this.gosNumber = gosNumber;
        this.mileage = mileage;
        this.param = param;
        this.consumption = consumption;
        this.fuelPrice = fuelPrice;
    }*/

    double calcFuel();

    double calcExpenses();

    int getCodeCar();

    int getGosNumber();

    int getMileage();

    int getParam();
}
