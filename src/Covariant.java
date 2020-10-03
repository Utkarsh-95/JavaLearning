/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
// Java program to demonstrate that we can have 
// different return types if return type in 
// overridden method is sub-type 
// Two classes used for return types. 
class As {
}

class Bs extends As {
}

class Cs extends Bs {
}

class Bases {

    As funs() {
        System.out.println("Base fun()");
        return new As();
    }
}

class Deriveds extends Bases {

    @Override
    Cs funs() {
        System.out.println("Derived fun()");
        return new Cs();
    }
}

public class Covariant {

    public static void main(String args[]) {
        Bases base = new Bases();
        base.funs();

        Deriveds derived = new Deriveds();
        derived.funs();
    }
}
