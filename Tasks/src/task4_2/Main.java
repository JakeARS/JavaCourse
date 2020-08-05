package task4_2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String newStr = "Karl stole coral from Klara, and Klara stole a clarnet from Karlл";

        CalcFreqLetters myMap = new CalcFreqLetters();

        myMap.calcFrequency(newStr);
        myMap.showFrequences();
    }

}
