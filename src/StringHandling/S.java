package StringHandling;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */

public interface S {

    void Show();
    
    default void display(){
        
        ArrayList<Integer> a = new ArrayList<>();
        Collections.synchronizedList(a);
        
    }
}
