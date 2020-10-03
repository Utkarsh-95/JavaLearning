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
public abstract class Mammal extends Animal {

    public Mammal(String name, int weight) {
        super(name, weight);
    }

    public abstract void jumpMammal();

    @Override
    public final void jump() {
        jumpMammal();
    }
}
