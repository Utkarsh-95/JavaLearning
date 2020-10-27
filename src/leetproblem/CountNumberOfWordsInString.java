/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

import java.util.HashSet;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class CountNumberOfWordsInString {

    public static void main(String[] args) {
        String s = "My name                                    \nis\tUttu\n  Cool";
        String s1 = "uaaaaaaaaaatkarsh";

//        countNumberOfWords(s);
//        System.out.println();
        System.out.println("Count " + countofWords(s));// total no of words in the string
        System.out.println("Print Consonent -" + printConsonentsAndVowelswithAndCondition(s1));
        System.out.println("Print Consonent =" + printConsonentsAndVowelswithHashSet(s1));

//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("java.runtime.version"));
    }

    public static String printConsonentsAndVowelswithHashSet(String s) {
        int vowelFlag = 0;
        int consonentFlag = 0;
        HashSet<Character> vowelsSet = new HashSet<>();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');
        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (vowelFlag == 0 && vowelsSet.contains(s.charAt(i))) {
                ss.append(s.charAt(i));
                consonentFlag = 0;
                vowelFlag = 1;
            } else if (consonentFlag == 0 && !(vowelsSet.contains(s.charAt(i)))) {
                ss.append(s.charAt(i));
                vowelFlag = 0;
                consonentFlag = 1;
            }
        }
        return ss.toString();
    }

    public static String printConsonentsAndVowelswithAndCondition(String s) {
        int vowelFlag = 0;
        int consonentFlag = 0;
        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (vowelFlag == 0 && (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                ss.append(s.charAt(i));
                consonentFlag = 0;
                vowelFlag = 1;
            } else if (consonentFlag == 0 && !(s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                ss.append(s.charAt(i));
                vowelFlag = 0;
                consonentFlag = 1;
            }
        }
        return ss.toString();
    }

    public static void countNumberOfWords(String line) {
//        System.out.println("=" + line.split(" ").length); //won't work with tabs and multiple spaces

        String trimmedLine = line.trim();
        int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;

        System.out.println("Total no of Words " + count);
    }

    public static int countofWords(String s) {
//        flag ---------- (state) is to check if word is occuring first time or not
        int in = 1;
        int out = 0;
        int state = out;
        int wc = 0;//word counter

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ' || s.charAt(i) == '\t' || s.charAt(i) == '\n') {
                state = out;
            } else if (state == out) {
                state = in;
                wc++;
            }
        }
        return wc;
    }

}
