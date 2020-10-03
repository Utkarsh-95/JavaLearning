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
class Hacker implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(100);
                System.out.print(" " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.out.print("Exception Occured " + e);
        }
    }
}

public class Runna {

    public static void main(String args[]) throws InterruptedException {
        Hacker obj = new Hacker();
        Thread t = new Thread(obj, "Java--");
        Thread t1 = new Thread(obj, "PHP");
        t.start();
        t.join();
        t1.start();
    }
}
