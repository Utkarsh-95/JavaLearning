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
    }
}
