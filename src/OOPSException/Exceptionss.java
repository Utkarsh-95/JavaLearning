/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Exceptionss {

    public static void main(String[] args) throws FileNotFoundException, IOException  {
        FileReader file = new FileReader("C:\\Users\\Utkarsh Pratap Singh\\Downloads\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt" 
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(fileInput.readLine());
        }

        fileInput.close();
    }
}
