package OOPSException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
class Parent1 {

    void fun() {
        System.out.println("Parent1");
    }
}

class Parent2 extends Parent1 {

    @Override
    void fun() {
        System.out.println("Parent2");
    }
}

public class Test extends Parent2 {

    public static void main(String args[]) {
        Test t = new Test();
        t.fun();
        
        Parent1 p = new Parent1();
        p.fun();
    }
}
