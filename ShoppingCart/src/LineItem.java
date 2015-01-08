/**
 * File: LineItem.java
 * Description: Stores an item name, quantity, and price per unit. Calculates the cost of item times the quantity.
 * Created by Casey Morris on 1/6/2015.
 */
public class LineItem {
    //Private member variables
    private String name;
    private int quantity;
    private double pricePerUnit;

    //Constructor to input user information
    public LineItem(String name, int quantity, double pricePerUnit)
    {
        this.name= name;
        this.quantity=quantity;
        this.pricePerUnit = pricePerUnit;
    }
    //Getter to retrieve cost of LineItem
    public double getCost()
    {
        double priceTotal;
        priceTotal = this.quantity * this.pricePerUnit; //Calculates quantity times price per unit
       return priceTotal;
    }

    //Setter for quantity of LineItem
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }


}
