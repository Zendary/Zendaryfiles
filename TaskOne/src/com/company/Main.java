package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;
    private static int mostUsedLetter;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        printLongestWord();
        // printFirstHalfOfEachWord();
        printMostFrequentLetter();
        printLeastFrequentLetter();

    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    // opgave 1
    private static void printLongestWord() {
        int counter = 0;
        String longestWord = "";
        for (int i = 0; i < text.length; i++) {
            if (counter < text[i].length()) {
                counter = text[i].length();
                longestWord = text[i];

            }


        }
        System.out.println(longestWord);
    }

    //opgave 2
    public static void printFirstHalfOfEachWord() {
        for (String s : text) {
            System.out.println(s.substring(0, s.length() / 2));
        }
    }

    //opgave 3
    public static void printMostFrequentLetter() {

        //et array med alle bogstaver i alfabetet
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
        int[] timesUsed = new int[29]; //et array med 29 pladser der ikke er tomme
        for (String s : text) { //text dokumentet kaldes nu gennem den String der hedder s
            for (int i = 0; i < s.length(); i++) { //en tæller der tæller så længe i er mindre end text dokumentets længde
                for (int j = 0; j < letters.length; j++) { //en tæller der går igennem hele alfabetet
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(letters[j])) { //en if statement der sammenligner hvert
                        timesUsed[j]++; //tæller hver gang et bogstav bliver brugt
                    }
                }
            }
        }
        int mostUsed = 0; //mostUsed sættes til 0
        int indexOfMostUsed = 0; //indexOfMostUsed sættes til 0
        for (int i = 0; i < timesUsed.length; i++) { //en tæller der fortsætter lige så mange gange et bogstav er brugt
            if (timesUsed[i] > mostUsed) {
                mostUsed = timesUsed[i]; //erstatter mostUsed med antallet af gange tælleren har talt et bogstav
                indexOfMostUsed = i; //sætter index til det bogstav der er mest brugt
            }
        }
        mostUsedLetter = mostUsed; 
        System.out.println(letters[indexOfMostUsed] + " was used a whopping " + mostUsed + " times");
    }

    public static void printLeastFrequentLetter() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
        int[] timesUsed = new int[29];
        for (String s : text) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < letters.length; j++) {
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(letters[j])) {
                        timesUsed[j]++;
                    }
                }
            }
        }
        int leastUsed = mostUsedLetter;
        int indexOfLeastUsed = 0;
        for (int i = 0; i < timesUsed.length; i++) {
            if (timesUsed[i] <= leastUsed) {
                leastUsed = timesUsed[i];
                indexOfLeastUsed = i;
            }
        }

        System.out.println(letters[indexOfLeastUsed] + " was only used " + leastUsed + " times");
    }
}