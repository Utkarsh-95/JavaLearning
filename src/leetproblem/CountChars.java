package leetproblem;

import java.util.HashMap;
import java.util.Scanner;

public class CountChars {

    static void totalcount(String sentence) {
        int count = 0;
        //Counts each character except space    
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total number of characters in a string: " + count);
    }

    static void characterCount(String inputString) {
        //Creating a HashMap containing char as a key and occurrences as a value
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();

        //checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                //If char 'c' is present in charCountMap, incrementing it's count by 1

                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        //Printing inputString and charCountMap 
        System.out.println(inputString + " : " + charCountMap);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = null;
        System.out.println("Enter Words");
        sentence = sc.nextLine();

//        String sentence = "DoneAndGone";
        totalcount(sentence);
        characterCount(sentence);
    }

}
