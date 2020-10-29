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
class Grandparent {

    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {

    public void Print() {
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {

    public void Print() {
        super.Print();
        System.out.println("Child's Print()");
    }
}

public class SuperTest {

    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}
