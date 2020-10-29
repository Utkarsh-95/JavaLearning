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
public class Juggler extends Thread {

    public static void main(String[] args) {
        try {
            Thread t = new Thread(new Juggler());
            Thread t2 = new Thread(new Juggler());
        } catch (Exception e) {
            System.out.print("e ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.print("e2 ");
            }
            System.out.print(Thread.currentThread().getName() + " ");
        }
    }
}
