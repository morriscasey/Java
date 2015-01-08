/**
 * File: ShoppingCartTester.java
 * Description: Creates different shopping carts, populates them with items, and calculates the total per cart.
 * Created by Casey Morris on 1/6/2015.
 */
public class ShoppingCartTester {
    public static void main(String[] args)
    {
        //Test Single Item in cart
        ShoppingCart singleItemCart = new ShoppingCart();
        LineItem item1 = new LineItem("Chicken",1,4.50);
        singleItemCart.add(item1);
        System.out.printf("%.2f%n", singleItemCart.getTotalCost());

        //Test a typical cart of 3 items
        ShoppingCart typicalCart = new ShoppingCart();
        LineItem typical1 = new LineItem("Flashlights",2,4.12);
        LineItem typical2 = new LineItem("Fork", 1, .35);
        singleItemCart.add(typical1);
        singleItemCart.add(typical2);
        System.out.printf("%.2f%n", singleItemCart.getTotalCost());

        //Test a full cart of items
        ShoppingCart fullCart = new ShoppingCart();
        LineItem full1 = new LineItem("egg",1, .25);
        LineItem full2 = new LineItem("bacon",1, 1.00);
        LineItem full3 = new LineItem("english muffin",1, 2.25);
        LineItem full4 = new LineItem("Greek Yogurt",1, .75);
        LineItem full5 = new LineItem("Orange Juice",1, 1.00);
        LineItem full6 = new LineItem("Tomato",1, .50);
        LineItem full7 = new LineItem("newspaper",1, 1.50);
        LineItem full8 = new LineItem("water bottle",1, 1.00);
        LineItem full9 = new LineItem("Granola",1, 4.50);
        LineItem full10 = new LineItem("Scratch Ticket",1, 1.00);
        fullCart.add(full1);
        fullCart.add(full2);
        fullCart.add(full3);
        fullCart.add(full4);
        fullCart.add(full5);
        fullCart.add(full6);
        fullCart.add(full7);
        fullCart.add(full8);
        fullCart.add(full9);
        fullCart.add(full10);
        System.out.printf("%.2f%n", fullCart.getTotalCost());

        //Test overflow of items
        ShoppingCart overflowCart = new ShoppingCart();
        LineItem over1 = new LineItem("match stick", 10, .2);
        LineItem over2 = new LineItem("Stuffed Penguin", 1, 19.99);
        overflowCart.add(over1);
        overflowCart.add(over2);
        System.out.printf("%.2f%n", overflowCart.getTotalCost());

        //Test an empty cart
        ShoppingCart emptyCart = new ShoppingCart();
        System.out.printf("%.2f%n", emptyCart.getTotalCost());
    }
}
