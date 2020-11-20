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
class TestOverLoadingMethod {

    /*    public int getData() //getdata() 1 
    {
        return 0;
    }

    public long getData(long a) //getdata 2 
    {
        return 1;
    }

    private String function() {
        return ("GFG");
    }

    public final static String function(int data) {
        return ("GeeksforGeeks");
    }*/
    public int add(int a, int b) {
        System.out.println("Printing with Int : " + a + " - " + b);
        return a + b;
    }

    public long add(long a, long b) {
        System.out.println("Printing with Long : " + a + " - " + b);
        return a + b;
    }

}

public class TestOverLoadingMethods {

    public static void main(String[] args) {
        TestOverLoadingMethod obj = new TestOverLoadingMethod();
//        System.out.println(obj.add(2, 40000L));
        obj.add(2, 4);
//        System.out.println(obj.getData());
//        System.out.println(obj.function());
    }
}
