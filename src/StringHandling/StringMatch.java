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
import java.util.regex.Pattern;

public class StringMatch {

    public static void main(String[] args) {

        String regex = ".@.";

        StringMatch.compare("utkarsh@gmail.com", regex);
        StringMatch.compare("a@N", regex);
        StringMatch.compare("Java@gmail", regex);

    }

    public static void compare(String str, String regex) {
        if (str.matches(regex)) {
            System.out.println(str + " matches");
        } else {
            System.out.println(str + " does not match");
        }
    }
}
