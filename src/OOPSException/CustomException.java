package OOPSException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Utkarsh Pratap Singh
 */
class MyExceptions extends Exception {

    public MyExceptions(String s) {
        // Call constructor of parent Exception 
        super(s);
    }
}

public class CustomException {

    public static void main(String args[]) {
        try {
            // Throw an object of user defined exception 
            throw new MyExceptions("CheckNCheck");
        } catch (MyExceptions ex) {
            System.out.println("Caught");

            // Print the message from MyException object 
            System.out.println(ex.getMessage());
        }
    }
}
