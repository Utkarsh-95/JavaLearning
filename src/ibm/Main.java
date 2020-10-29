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
class Base extends Exception {
}

class Derived2 extends Base {
}

public class Main {

    public static void main(String args[]) {
        // some other stuff
        try {
            // Some monitored code
            throw new Derived2();
        } catch (Base b) {
            System.out.println("Caught base class exception");
        }
//        catch (Derived2 d) {
//            System.out.println("Caught derived class exception");
//        }
    }
}
