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
// Java program to illustrate the concept of Association 
class Bank {

    private String name;

    // bank name 
    Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

// employee class 
class Employee {

    private String name;

    // employee name 
    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

// Association between both the 
// classes in main method 
public class Association {

    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Suka");

        Bank bank1 = new Bank("ICICI");
        Employee emp1 = new Employee("Nidhi");

        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
        System.out.println(emp1.getEmployeeName() + " is employee of " + bank1.getBankName());
    }
}
