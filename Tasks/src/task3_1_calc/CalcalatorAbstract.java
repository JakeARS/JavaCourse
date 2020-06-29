package task3_1_calc;

public abstract class CalcalatorAbstract {
    abstract float calcSum(float a, float b);

    abstract float calcDifference (float a, float b);

    abstract float calcProduct (float a, float b);

    abstract float calcQuotient(float a, float b);

    abstract void calcPow(int value, int power);

    abstract void calcSqrt(int value);

    abstract float calcExpression(String expr);
}
