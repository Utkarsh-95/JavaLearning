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
class A {

    public int x;

    protected int y;

    void cal(int a, int b) {

        x = a + 1;

        y = b;

    }

}

class B {

    public static void main(String args[]) {

        A obj = new A();

        obj.cal(2, 3);

        System.out.println(obj.x + " " + obj.y);

    }

}
