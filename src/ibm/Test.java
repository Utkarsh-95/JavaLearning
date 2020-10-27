package ibm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
class Derived {

    protected final void getDetails() {
        System.out.println("Derived class");
    }
}

public class Test extends Derived {

    @Override
    protected final void getDetails() {
        System.out.println("Test class");
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.getDetails();
    }
}
