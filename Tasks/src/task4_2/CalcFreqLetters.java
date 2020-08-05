package task4_2;

import java.util.HashMap;
import java.util.Map;

public class CalcFreqLetters {
    HashMap<Character, Integer> lettersFreq = new HashMap<>();

    public CalcFreqLetters() {
        for (Character i = 'a'; i <= 'z'; i++) {
            lettersFreq.put(i, 0);
        }
    }

    public void calcFrequency(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (lettersFreq.containsKey(Character.toLowerCase(a.charAt(i)))) {
                //lettersFreq.get(a.substring(i, 1));
                lettersFreq.put(Character.toLowerCase(a.charAt(i)), lettersFreq.get(Character.toLowerCase(a.charAt(i))) + 1);
            }
        }
    }

    public void showFrequences() {
        for (Character i : lettersFreq.keySet()
        ) {
            System.out.println("Буква " + i + " встречается " + lettersFreq.get(i) + " раз(а)");
        }
    }
}