package com.cw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Telephone tel = new Telephone();
        tel.sendSMS("500 400 300", "Hello world!");

        //zad2
        ArrayList<String> words = new ArrayList<>();
        words.add("ala");
        words.add("dog");
        words.add("cat");
        words.add("cat");
        words.add("monkey");
        words.add("mouse");
        Zad2i3 slowo = new Zad2i3();
        slowo.getSentenceMostOccurredWord(words);
        System.out.println(slowo.getSentenceMostOccurredWord(words));

        //zad3
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);
        Zad2i3 liczba = new Zad2i3();
        liczba.getLastUnique(sequence);
        System.out.println(liczba.getLastUnique(sequence));
    }
}