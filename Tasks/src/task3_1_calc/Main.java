package task3_1_calc;

import task2_3.Calculator;
import task3_2.MyLoggerCustom;

public class Main {

    public static void main(String[] args) {
        //Calculator newCalc = new Calculator();
        MyLoggerCustom logger = new MyLoggerCustom();
        CustomCalculator newCalc = new CustomCalculator();
        //System.out.print("Сумма чисел " + 2 + " и " + 10 + " равна ");
        logger.writeLog("Сумма чисел " + 2 + " и " + 10 + " равна ");
        System.out.print(newCalc.calcSum(2, 10));

        //System.out.print("Разница чисел " + 2 + " и " + 10 + " равна ");
        logger.writeLog("Разница чисел " + 2 + " и " + 10 + " равна ");
        System.out.print(newCalc.calcDifference(2, 10));

        //System.out.print("Произведение чисел " + 2 + " и " + 10 + " равно ");
        logger.writeLog("Произведение чисел " + 2 + " и " + 10 + " равно ");
        System.out.print(newCalc.calcProduct(2, 10));

        //System.out.print("Частное чисел " + 2 + " и " + 10 + " равно ");
        logger.writeLog("Частное чисел " + 2 + " и " + 10 + " равно ");
        System.out.print(newCalc.calcQuotient(2, 10));

        logger.writeLog(2 + " в степени " + 10 + " равно ");
        newCalc.calcPow(2, 10);

        logger.writeLog("Вычисление квадратного корня из 8: ");
        newCalc.calcSqrt(64);

        String expr = "-5-5*10-5+5-5+5+100/2";//"-5+10*2";
        logger.writeLog("Вычисление значение выражения " + expr + ": ");
        //System.out.print("Результат выполнения выражения " + expr + " равен ");
        System.out.println(newCalc.calcExpression(expr));
    }
}
