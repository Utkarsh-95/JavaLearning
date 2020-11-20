/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

import java.util.Hashtable;

/**
 *
 * @author Utkarsh Pratap Singh
 */
class FinalizeDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized called");
    }
}

public class NoObjectsCreated {

    static int noOfObjects = 0;

    // Instead of performing increment in the constructor 
    // instance block is preferred to make this program generic. 
    {
        noOfObjects += 1;
    }

    public NoObjectsCreated() {
    }

    public NoObjectsCreated(int n) {
    }

    public NoObjectsCreated(String s) {
    }

    public static void main(String args[]) {
        NoObjectsCreated t1 = new NoObjectsCreated();
        NoObjectsCreated t2 = new NoObjectsCreated(5);
        NoObjectsCreated t3 = new NoObjectsCreated("GFG");
        NoObjectsCreated t4 = new NoObjectsCreated("GFG1");

        // We can also write t1.noOfObjects or  t2.noOfObjects or t3.noOfObjects 
        System.out.println(NoObjectsCreated.noOfObjects);

        FinalizeDemo fdRef = new FinalizeDemo();
        fdRef = null;
        System.gc();
        System.out.println(fdRef);

        System.out.println(NoObjectsCreated.noOfObjects);

//        Hashtable<String, String> ht = new Hashtable<>();
//        ht.put(null, "hhj");
//        System.out.println(ht);
        Integer a = 10;
        int b = a;

    }
}
