//Hafsa Salman
//OOP Lab 03: Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 03: Task no. 01");
        System.out.println();

        cartItem Paper = new cartItem("Paper", 10.0, 7);
        Paper.displayCartItemDetails();
        Paper.calculateTotalPrice();

        cartItem Bag = new cartItem("Bag", 25.7, 2);
        Bag.displayCartItemDetails();
        Bag.calculateTotalPrice();
    }
}

class cartItem
{
    String productName;
    double price;
    int quantity;

    public cartItem (String productName, double price, int quantity)
    {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayCartItemDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public void calculateTotalPrice()
    {
        double totalPrice = price * quantity;

        System.out.println("Total Price: " + totalPrice);
        System.out.println();
    }
}