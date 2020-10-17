/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class VariableConversion {

    private static String checkVariableCtoJava(String s1, String s2) {

        String str[] = s1.split("_");
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);

        for (int i = 1; i < str.length; i++) {
            sb.append(Character.toUpperCase(str[i].charAt(0))).append(str[i].substring(1, str[i].length()));
        }

        return sb.toString();
    }

    private static String checkVariableJavatoC(String s1) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            if (Character.isUpperCase(s1.charAt(i))) {
                sb.append("_").append(Character.toUpperCase(s1.charAt(i)));
            } else {
                sb.append(s1.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "this_is_a_variable";
        String str2 = "thisIsAVariable";
        System.out.println(checkVariableCtoJava(str1, str2));
        System.out.println(checkVariableJavatoC(str2));
    }

}
