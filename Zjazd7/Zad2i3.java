package com.cw7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zad2i3 {
//zad2
    public static String getSentenceMostOccurredWord(ArrayList<String> sentence) {
        int j = 1;
        int k = 0;
        String wynik = "";
        for (int i = 0; i < sentence.size(); i++) {
            for (j = 1; j < sentence.size(); j++) {
                if (i != j && sentence.get(i) == sentence.get(j)) {
                    k++;
                    if (k > 1) {
                        break;
                    }
                    wynik += sentence.get(i);
                }
            }
        }
        if (k == 0) {
            wynik += "Słowa nie powtarzają się.";
        }
        return wynik;
    }
//zad3
    public static Integer getLastUnique(ArrayList<Integer> sequence) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < sequence.size(); i++) {
            if (m.containsKey(sequence.get(i))) {
                m.put(sequence.get(i), m.get(sequence.get(i)) +1);
            } else {
                m.put(sequence.get(i), 1);
            }
        }
        for (int i = sequence.size() - 1; i > 0; i--) {
            if (m.get(sequence.get(i)) == 1) {
                return sequence.get(i);
            }
        }
        return -1;
    }
}
