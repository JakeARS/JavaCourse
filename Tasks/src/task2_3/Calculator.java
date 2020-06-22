package task2_3;

public class Calculator {

    public float calcSum(float a, float b) {
        //System.out.println("Сумма чисел " + a + " и " + b + " равна " + (a + b));
        return (a + b);
    }

    public float calcDifference (float a, float b) {
        //System.out.println("Разница чисел " + a + " и " + b + " равна " + (a - b));
        return (a - b);
    }

    public float calcProduct (float a, float b) {
        //System.out.println("Произведение чисел " + a + " и " + b + " равно " + (a * b));
        return (a * b);
    }

    public float calcQuotient(float a, float b) {
        //System.out.println("Частное чисел " + a + " и " + b + " равно " + ((float)a / (float)b));
        return ((float)a / (float)b);
    }

    public void calcPow(int value, int power) {
        int result = value;
        for (int i = 0; i < power - 1; i++) {
            result = result * value;
        }
        System.out.println(value + " в степени " + power + " равно " + result);
    }

    public void calcSqrt(int value) {
        if (value < 0) {
            System.out.println("Квадратного корня у числа " + value + " нет");
        } else {
            System.out.println("Квадратный корень числа " +value + " равен " + Math.sqrt(value));
        }
    }

    public float calcExpression(String expr) {
        String symbol = expr.contains("+") ? "\\+" : (expr.contains("-") ? "\\-" : null);
        String[] str;
        int cnt = 0;

        for (int i = 0; i < expr.length(); i++) {
            if ((expr.substring(i, i+1).equals("+") || expr.substring(i, i+1).equals("-") /*|| expr.substring(i, i+1).equals("*") || expr.substring(i, i+1).equals("/")*/)
                    && (i != 0)) {
                cnt++;
            }
        }
        String[] acts = new String[cnt];

        int k = 0;
        for (int i = 0; i < expr.length(); i++) {
            if ((expr.substring(i, i+1).equals("+") || expr.substring(i, i+1).equals("-") /*|| expr.substring(i, i+1).equals("*") || expr.substring(i, i+1).equals("/")*/)
                    && (i != 0)) {
                acts[k] = expr.substring(i, i+1);
                k++;
            }
        }

        if (expr.substring(0, 1).equals("-")) {
            str = expr.substring(1).split("[\\+\\-]");
        } else {
            str = expr.split("[\\+\\-]");//.split(symbol);
        }
        //String[] acts = expr.split("\\d");
        if (expr.substring(0, 1).equals("-")) {
            str[0] = "-" + str[0];
        }
        float result = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].split("\\*").length > 1 || str[i].split("\\/").length > 1) {
                //System.out.println(str[i].substring(2));
                if (str[i].contains("*")) {
                    result = calcProduct(Float.valueOf(str[i].substring(0, str[i].indexOf('*'))), Float.valueOf(str[i].substring((str[i].indexOf('*')+1))));
                }
                if (str[i].contains("/")) {
                    result = calcQuotient(Float.valueOf(str[i].substring(0, str[i].indexOf('/'))), Float.valueOf(str[i].substring((str[i].indexOf('/')+1))));
                }
                //str[i] = String.valueOf((int)result);
                str[i] = String.valueOf(result);
            }
        }
        result = 0;
        for (int i = 0; i < acts.length; i++) {
            if (acts[i].equals("+")) {
                result = calcSum(i == 0 ? Float.valueOf(str[i]) : result, Float.valueOf(str[i + 1]));
            } else if (acts[i].equals("-")) {
                result = calcDifference(i == 0 ? Float.valueOf(str[i]) : result, Float.valueOf(str[i + 1]));
            }
        }
        return result;
    }
}
