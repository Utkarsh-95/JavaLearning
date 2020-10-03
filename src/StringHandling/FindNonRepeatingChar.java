/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author Utkarsh Pratap Singh
 */
import java.util.ArrayList;
import java.util.List;

public class FindNonRepeatingChar {

    public static void main(String[] args) {

//        System.out.println(printFirstNonRepeatingChar("abcaabcdedxy"));
        System.out.println(printFirstNonRepeatingChar("abca"));
//        System.out.println(printFirstNonRepeatingChar("aaa"));

    }

    private static Character printFirstNonRepeatingChar(String string) {
        char[] chars = string.toCharArray();

        List<Character> discardedChars = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (discardedChars.contains(c)) {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (c == chars[j]) { // match found
                    discardedChars.add(c);
                    System.out.println("Discarded Char = " + discardedChars.get(0));
                    break;
                } else if (j == chars.length - 1) { // no match found till end
                    return c;
                }
            }
        }

        System.out.println("Discarded Char = " + discardedChars.get(0));
        return null;
    }

}
