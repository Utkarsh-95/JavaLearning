/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class CalcCheckDouble {

    public static int evaluateexpression(String expression) {

        // convert string into char array
        Stack<Integer> intvalue = new Stack<>();

        Stack<Character> charvalue = new Stack<>();

        char[] Strtokens = expression.toCharArray();

        for (int i = 0; i < Strtokens.length; i++) {

            if (Strtokens[i] == ' ') {
                continue;
            }

            if (Strtokens[i] >= '0' && Strtokens[i] <= '9') {

                StringBuilder strbuffer = new StringBuilder();

                strbuffer.append(Strtokens[i]);

                while (i + 1 < Strtokens.length && Strtokens[i + 1] >= '0' && Strtokens[i + 1] <= '9') {
                    strbuffer.append(Strtokens[++i]);
                }

                intvalue.push(Integer.parseInt(strbuffer.toString()));

            } else if (Strtokens[i] == '(') {
                charvalue.push(Strtokens[i]);
            } else if (Strtokens[i] == ')') {
                while (charvalue.peek() != '(') {
                    intvalue.push(OprationAdd(charvalue.pop(), intvalue.pop(), intvalue.pop()));
                }

                charvalue.pop();

            } else if (Strtokens[i] == '+' || Strtokens[i] == '-' || Strtokens[i] == '*' || Strtokens[i] == '/' || Strtokens[i] == '%') {

                while (!charvalue.empty() && precedence(Strtokens[i], charvalue.peek())) {
                    intvalue.push(OprationAdd(charvalue.pop(), intvalue.pop(), intvalue.pop()));
                }

                charvalue.push(Strtokens[i]);
            }
        }

        while (!charvalue.empty()) {
            intvalue.push(OprationAdd(charvalue.pop(), intvalue.pop(), intvalue.pop()));
        }

        return intvalue.pop();

    }

    public static boolean precedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-') && (op1 == '*' || op1 == '%')) {
            return false;
        } else {
            return true;
        }
    }

    public static int OprationAdd(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException(" we can not divide by Zero");
                }
                return a / b;
            case '%':
                return a % b;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Enter the  value with expression");
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        System.out.println("Output of evaluateexpression string:::" + evaluateexpression(expr));

    }

}
