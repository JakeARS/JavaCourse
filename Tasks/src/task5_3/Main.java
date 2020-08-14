package task5_3;

public class Main {
    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
        System.out.println("Сумма чисел " + 2 + " и " + 10 + " равна ");
        System.out.println(newCalc.calcSum(2, 10));
        System.out.println("Разница чисел " + 2 + " и " + 10 + " равна ");
        System.out.println(newCalc.calcDifference(2, 10));
        System.out.println("Произведение чисел " + 2 + " и " + 10 + " равно ");
        System.out.println(newCalc.calcProduct(2, 10));
        System.out.println("Частное чисел " + 2 + " и " + 10 + " равно ");
        try {
            System.out.println(newCalc.calcQuotient(2, 10));
        } catch (ZeroDivisorException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Частное чисел " + 2 + " и " + 10 + " равно ");
        try {
            System.out.println(newCalc.calcQuotient(2, 0));
        } catch (ZeroDivisorException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        newCalc.calcPow(2, 10);

        try {
            newCalc.calcSqrt(64);
        } catch (SqrtException e) {
            e.printStackTrace();
        }

        try {
            newCalc.calcSqrt(-64);
        } catch (SqrtException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        String expr = "-5-5*10-5+5-5+5+100/2";
        System.out.println("Результат выполнения выражения " + expr + " равен ");
        System.out.println(newCalc.calcExpression(expr));
    }
}