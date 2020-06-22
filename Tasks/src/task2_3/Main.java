package task2_3;

public class Main {
    public static void main(String[] args) {
        Calculator newCalc = new Calculator();
        System.out.print("Сумма чисел " + 2 + " и " + 10 + " равна ");
        System.out.println(newCalc.calcSum(2, 10));
        System.out.print("Разница чисел " + 2 + " и " + 10 + " равна ");
        System.out.println(newCalc.calcDifference(2, 10));
        System.out.print("Произведение чисел " + 2 + " и " + 10 + " равно ");
        System.out.println(newCalc.calcProduct(2, 10));
        System.out.print("Частное чисел " + 2 + " и " + 10 + " равно ");
        System.out.println(newCalc.calcQuotient(2, 10));

        newCalc.calcPow(2, 10);

        newCalc.calcSqrt(64);

        String expr = "-5-5*10-5+5-5+5+100/2";//"-5+10*2";
        System.out.print("Результат выполнения выражения " + expr + " равен ");
        System.out.println(newCalc.calcExpression(expr));
    }
}
