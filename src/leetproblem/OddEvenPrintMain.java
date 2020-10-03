/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class OddEvenPrintMain {

    boolean odd;
    int count = 1;
    int MAX = 20;

    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                while (!odd) {
                    try {
//                        System.out.println("Odd waiting : " + count);
                        wait();
                        Thread.sleep(1000);
//                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
        }
        synchronized (this) {
            while (count < MAX) {

                while (odd) {
                    try {
//                        System.out.println("Even waiting: " + count);
                        wait();
//                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();

            }
        }
    }

    public static void main(String[] args) {

        OddEvenPrintMain oep = new OddEvenPrintMain();
        oep.odd = true;
        Thread t1 = new Thread(() -> {
            oep.printEven();
        });

        Thread t2 = new Thread(() -> {
            oep.printOdd();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }

    }
}
