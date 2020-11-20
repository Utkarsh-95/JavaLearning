/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StaticMethodInvocation {

//    Well this is a strange situation, We all have seen NullPointerException when we invoke a method on the object that is NULL, 
//    But here this program will work and prints “Test foo called .
//    The reason for this is the java compiler code optimization
//    When the java code is compiled to produced byte code, it figures out that foo() is a static method and should be called using class, 
//    So it changes the method call obj.foo () to Test.foo() and hence no NullPointerException.
    public static String foo() {
        System.out.println("Test foo called");
        return "";
    }

    public static void main(String args[]) {
        StaticMethodInvocation obj = null;
        System.out.println(obj.foo());
    }

}
