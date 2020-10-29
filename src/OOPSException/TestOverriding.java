/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

/**
 *
 * @author Utkarsh Pratap Singh
 */
class TestOverridings {

    protected int add(int a, int b) throws Exception{
        System.out.println("Parent");
        return a/b;
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
    public int add(int a, int b) throws ArithmeticException{
        System.out.println("Child");
        return a/b;

    }

    public static void main(String[] args) throws Exception {
        TestOverridings obj = new TestOverriding();
        int add = obj.add(1, 0);
        System.out.println(add);
//        obj.getDetails("GFG");
    }
}
