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
class TestP {

    void m1() {
        System.out.println("in m1 P");
    }

    void m2() {
        System.out.println("in m2 P");
    }
}

class TestC extends TestP {

    @Override
    void m1() {
        System.out.println("in m1 P");
    }

    @Override
    void m2() {
        System.out.println("in m2 C");
    }
}

public class TestPC {

    public static void main(String[] args) {
        TestP obj = new TestC();
        obj.m2();
    }
}
