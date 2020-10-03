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

    private String errorCode = "Unknown_Exception";
    private String msg = "Checking";

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Exception.MyException.main()" + MyException.class);
    }

}
