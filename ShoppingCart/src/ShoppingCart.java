/**
 * File: ShoppingCart.java
 * Description: Creates a shopping cart of items and keeps track of the total cost.
 * Created by Casey Morris on 1/6/2015.
 */
public class ShoppingCart {
    final int maxItems = 10;
    //Array of LineItems
    private LineItem[] itemArray;
    private int totalItems;
    private double totalCost;

    public ShoppingCart()
    {
        totalItems = 0;
        totalCost = 0;
        itemArray = new LineItem[maxItems];
    }

    public void add(LineItem newItem)
    {
        if (totalItems <= maxItems)
        {
            itemArray[totalItems] = newItem;
            this.totalItems++;
            this.totalCost += newItem.getCost();
        }
    }

    public double getTotalCost()
    {
        return this.totalCost;
    }
}
