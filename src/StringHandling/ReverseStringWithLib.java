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
interface StrFunc {

    String disp(String n);
}

class ReverseStringWithLib {

    public static void main(String args[]) {
        StrFunc output = (str) -> {
            String result = "";
            for (int a = str.length() - 1; a >= 0; a--) {
                result += str.charAt(a);
            }
            return result;
        };

        System.out.println(output.disp("HACKEREARTH"));
    }
}
