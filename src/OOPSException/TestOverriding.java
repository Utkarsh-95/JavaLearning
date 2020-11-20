/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

import java.util.Arrays;

/**
 *
 * @author Utkarsh Pratap Singh
 */
class TestOverridings {

//    method overrriding need same method argument and same signature means same return type
    protected int add(int a, int b) throws Exception {
        System.out.println("Parent");
        return a / b;
    }

//    public void getDetails(String temp) {
//        System.out.println("Derived class " + temp);
//    }
}

public class TestOverriding extends TestOverridings {

//    public void getDetails(String temp) {
//        System.out.println("Test class " + temp);
////        return 0;
//    }
    @Override
    public int add(int a, int b) throws ArithmeticException {
        System.out.println("Child");
        return a / b;

    }

    public static void main(String[] args) throws Exception {
//        

        int i = 10;
        System.out.printf("%d%d%d", i, ++i, i++);
        System.out.println("");
        System.out.print('A' + 'B');//ascii value add
        System.out.println("");
        System.out.print("A" + "B" + 'A');  //concat
        System.out.println("");
        char[] str = {'i', 'n', 'c', 'l', 'u', 'd', 'e', 'h', 'e', 'l', 'p'};
        System.out.println(Arrays.toString(str));
        System.out.println(str.toString());
        System.out.print("Hello");
        System.out.println("Guys!");
//        byte x = 12;
//        byte y = 13;
//        byte result = x + y;
//        System.out.print(result);

//        TestOverridings obj = new TestOverriding();
//        int add = obj.add(1, 0);
//        System.out.println(add);
//        obj.getDetails("GFG");
    }
}
