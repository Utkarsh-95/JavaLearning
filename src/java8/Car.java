/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Car {

    @JsonField("manufacturer")

    private final String make;

    @JsonField
    private final String model;
    private final String year;

    public Car(String make, String model, String year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        return year + " " + make + " " + model;
    }

}
