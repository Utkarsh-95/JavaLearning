/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularDependency;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Lift {

    private IBuildingProxy building;

    private int Speed;

    public Lift(Building b) {
        this.building = b;
        setSpeed();
    }

    private void setSpeed() {

        if (building.getFloor() > 20) {
// one set of functionalities may be the the speed of the lift will be more
            this.Speed = 10;
            System.out.println("CircularDependency.Lift.setSpeed() in if " + Speed);
        } else {
//different set of functionalities may be the speed of the lift will be less
            this.Speed = 5;
            System.out.println("CircularDependency.Lift.setSpeed() in else " + Speed);
        }

    }

    public int getSpeed() {
        return Speed;
    }

}
