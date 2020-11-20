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
public class MyException extends IOException {

    private static final long serialVersionUID = 4664456874499611218L;

    private static String errorCode = "Unknown_Exception";
    private static String msg = "Checking";

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public static String getMsg() {
        return msg;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public static void main(String[] args) throws Exception {
        MyException myException = new MyException(msg, errorCode);
        System.out.println(myException.getErrorCode());

//        try {
//            throw new Error();
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
    }

}
