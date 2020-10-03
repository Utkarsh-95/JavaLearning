/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volkstest;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Animal {

    public final String name;
    public final int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void jump() {
        System.out.println(name + " Jumped");
    }

    public static void main(String[] args) {
        Mammal m = new Mammal("uttu", 0) {
            @Override
            public void jumpMammal() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println(m.name);
    }
}
