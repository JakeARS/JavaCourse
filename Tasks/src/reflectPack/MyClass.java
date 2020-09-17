package reflectPack;

import java.beans.Transient;

public class MyClass {

    @RoundAnnotation(value = true)
    private double firstValue = 5.6;

    @RoundAnnotation(value = false)
    private double secondValue = 32.2;

    @RoundAnnotation(value = true)
    private double thirdValue = 11.1;


    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void myMethod() {
        System.out.println("Hello Annotation");
    }

    public double getThirdValue() {
        return thirdValue;
    }

    public void setThirdValue(double thirdValue) {
        this.thirdValue = thirdValue;
    }
}