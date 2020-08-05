package task4_5;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] inputString = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};

        System.out.println("Computing results...");

        showWinner(inputString);
    }

    public static void showWinner(String[] inputString) {
        HashMap<String, Number> resultTable = new HashMap<>();
        //Pattern patternName = Pattern.compile("[a-zA-Z]+");
        //HashSet<String> names = new HashSet(Arrays.asList(inputString));
        int maxPoints = 0;
        String winner = new String();

        //реализация через поиск пробела
        for (int i = 0; i < inputString.length; i++) {
            if (!resultTable.containsKey(inputString[i].substring(0, inputString[i].indexOf(" ")))) {
                resultTable.put(inputString[i].substring(0, inputString[i].indexOf(" ")), Integer.parseInt(inputString[i].substring(inputString[i].indexOf(" ")+1)));
            }
            else {
                resultTable.put(inputString[i].substring(0, inputString[i].indexOf(" ")),
                        Integer.parseInt(inputString[i].substring(inputString[i].indexOf(" ")+1)) + (int) resultTable.get(inputString[i].substring(0, inputString[i].indexOf(" "))) );
            }
            if ((int) resultTable.get(inputString[i].substring(0, inputString[i].indexOf(" "))) > maxPoints) {
                maxPoints = (int) resultTable.get(inputString[i].substring(0, inputString[i].indexOf(" ")));
                winner = inputString[i].substring(0, inputString[i].indexOf(" "));
            }
        }

        System.out.println("And the winner of the TASK4_5 World Competition Cup is ........ " + winner + "!!!! With " + maxPoints + " points!!!");

        //реализация через регулярные выражения
        /*for (int i = 0; i < inputString.length; i++) {
            Matcher matcherName = patternName.matcher(inputString[i]);
            if (matcherName.find()) {
                System.out.println(matcherName.group());
                resultTable.put(matcherName.group(), 0);
            }
        }*/
    }
}