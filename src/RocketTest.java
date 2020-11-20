/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Utkarsh Pratap Singh
 */
class Rocket {

    private void takeOff() {
        System.out.println("mars");
    }
}

public class RocketTest extends Rocket {

    public static void main(String[] args) {
        new RocketTest().liftOff();
    }

    void liftOff() {
        takeOff();
    }

    private void takeOff() {
        System.out.println("jupiter");
    }
}
