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
class Alpha {

    static String s = " ";

    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {

    private SubAlpha() {
        s += "sub ";
    }
}

public class SubSubAlpha extends Alpha {

    private SubSubAlpha() {
        s += "subsub ";
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
}
