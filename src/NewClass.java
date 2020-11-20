/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class NewClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "he is a good programmer, he won 865 competitions, but sometimes he do[]nt. What do you think? All test-cases should pass. Done-done?";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        count = count + 1;
//        System.out.println(count);
        System.out.println(countWordsUsingStringTokenizer(s));
    }

    public static int countWordsUsingStringTokenizer(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }
}
