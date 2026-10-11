package Shopping_Application;

public class Product
{
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }
public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void print(Object object)
    {
        System.out.println(object);
    }

    //Display of product information
    public void displayInfo()
    {
        print("Product name: " + name);
        print("Product price: $" + price);
    }
}