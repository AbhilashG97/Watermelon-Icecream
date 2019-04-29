/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Abhilash G <abhilashg@am.students.amrita.edu>
 */
public class WatermelonDessert {
    private String dessertName;
    private float dessertPrice;

    public WatermelonDessert(String dessertName, float dessertPrice) {
        this.dessertName = dessertName;
        this.dessertPrice = dessertPrice;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public float getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(float dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    @Override
    public String toString() {
        return "WatermelonDessert{" + "dessertName=" + dessertName + ", dessertPrice=" + dessertPrice + '}';
    }

}
