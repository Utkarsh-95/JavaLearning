/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Utkarsh Pratap Singh
 */
class NullInstanceof {

    public static void main(String[] args) {
        String str = null;
        if (str instanceof Object)
            //NULLCHK 
            System.out.println("str is Object");
         else 
            System.out.println("str is not Object");
        
    }
}
