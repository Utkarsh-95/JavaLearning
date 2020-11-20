/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Properties;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class NewClass1 {
    
    public enum Days{MON,TUES,WED}

    public static void main(String[] args) {
        
        for(Days d: Days.values())
            ;
            Days []d2 = Days.values();
            System.out.println(d2[2]);
        
        
//        int x = 0;
//        int y = 0;
//        for (int z = 0; z < 5; z++) {
//            if ((++x > 2) || (++y > 2)) {
//                x++;
//            }
//        }
//        System.out.println(x + " " + y);
    }
}
