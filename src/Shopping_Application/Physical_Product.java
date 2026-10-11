package Shopping_Application;

 public class Physical_Product extends Product {

     private double weight;

     public void setWeight(double weight)
     {
         this.weight = weight;
     }
     public double getWeight()
     {
         return weight;
     }

     public Physical_Product(String name, double price, double weight) {
         super(name, price);
         this.weight = weight;
     }

     @Override
     public void displayInfo()
     {
         super.displayInfo();
         print("Product Weight: " + weight +"kg");
     }
 }
