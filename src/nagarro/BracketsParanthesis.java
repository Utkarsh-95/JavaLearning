/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

import java.util.Stack;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class BracketsParanthesis {

    private static boolean checkBalance(String input) {//=== for data and data type and == only check datatype diff in js jquery

//        Deque<Character> st = new ArrayDeque<>();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '[' || input.charAt(i) == '(' || input.charAt(i) == '{') {
                st.push(input.charAt(i));
            } else //if (input.charAt(i) == ']' || input.charAt(i) == ')' || input.charAt(i) == '}') 
            {
                switch (input.charAt(i)) {
                    case ']':
                        if (st.peek() == '[') {
                            st.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ')':
                        if (st.peek() == '(') {
                            st.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (st.peek() == '{') {
                            st.pop();
                        } else {
                            return false;
                        }
                        break;
                }

            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]";
//        System.out.println(checkBalance(str));

        if (checkBalance(str) == true) {
            System.out.println("Balanced Paranthesis");
        } else {
            System.out.println("Not a Balanced Paranthesis");
        }
    }

}
