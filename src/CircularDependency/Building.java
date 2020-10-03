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
public class Building implements IBuildingProxy {

    private Lift lift;

    private int floor;

    public Building() {

        lift = new Lift(this);

        setFloor(15);

    }

    @Override
    public int getFloor() {
        return floor;
    }

    @Override
    public void setFloor(int Floor) {
        this.floor = Floor;
    }

}
