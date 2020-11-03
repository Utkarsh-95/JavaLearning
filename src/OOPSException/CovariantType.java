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
class Ass {
}

class Bss extends Ass {
}

class Base {

    Ass fun() {
        System.out.println("Base fun()");
        return new Ass();
    }
}

class Derived extends Base {

    @Override
    Bss fun() {
        System.out.println("Derived fun()");
        return new Bss();
    }
}

public class CovariantType {

    public static void main(String args[]) {
        Base base = new Base();
        base.fun();

        Derived derived = new Derived();
        derived.fun();
    }
}
