/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class BooleanTest {

    public static void method1(String var1, String var2) {

        boolean isConcatinated = false;
        var1 = var1 + var2;
        if (isConcatinated) {
            System.out.println("result" + var1);
        } else {
            System.out.println("result" + var2);
        }
    }

    public static void main(String[] args) {

        method1("Hi", "How are you?");
    }
}
