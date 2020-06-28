package task3_1;

public class Light3_1 implements Transport3_1 {
    int codeCar;
    int gosNumber;
    int mileage;
    private static double consumption = 12.5;
    private static double fuelPrice = 46.1;
    private static int param = 0;

    public Light3_1(int codeCar, int gosNumber, int mileage) {
        //super(codeCar, gosNumber, mileage, param, consumption, fuelPrice);
        this.codeCar = codeCar;
        this.gosNumber = gosNumber;
        this.mileage = mileage;
    }

    @Override
    public double calcFuel(){
        return (consumption/100)*mileage;
    }

    @Override
    public double calcExpenses(){
        return (consumption/100)*mileage*fuelPrice;
    }

    @Override
    public int getCodeCar() {
        int a;
        a = this.codeCar;
        return a;
    }

    @Override
    public int getGosNumber() {
        int a;
        a = this.gosNumber;
        return a;
    }

    @Override
    public int getMileage() {
        int a;
        a = this.mileage;
        return a;
    }

    @Override
    public int getParam() {
        int a;
        a = this.param;
        return a;
    }
}
