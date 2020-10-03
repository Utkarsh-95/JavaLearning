/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

import java.io.IOException;

/**
 *
 * @author Utkarsh Pratap Singh
 */
import java.util.*;

public class PirateTalk {

    public static void main(String... arrrrrgs) {
        Properties p = System.getProperties();
        p.setProperty("pirate", "scurvy");
        String s = p.getProperty("argProp") + " ";
        s += p.getProperty("pirate");
        System.out.println(s);
    }
}
