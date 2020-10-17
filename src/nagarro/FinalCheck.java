/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public final class FinalCheck {

//Declare the class as final so it can’t be extended.
//Make all fields private so that direct access is not allowed.
//Don’t provide setter methods for variables.
//Make all mutable fields final so that its value can be assigned only once.
//Initialize all the fields via a constructor performing deep copy.
//Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    Don’t provide setter methods for variables.
//    public void setFinal_variable(int final_variable) {
//        this.final_variable = final_variable;
//    }
    public FinalCheck(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        FinalCheck fc = new FinalCheck(1, "Utkarsh");
        fc.show();
    }
}
