import Shopping_Application.*;

import java.util.Scanner;

public static void main(String[] args)
{
    List<Product> catalog = new ArrayList<>();
    OverloadPrint print = new OverloadPrint();
    final int userValue;

 catalog.add(new Virtual_Product("Ponny Tail Wavons", 50.67, "https://www.amazon.com/ponny_tail_wavons"));
 catalog.add(new Virtual_Product("Perfumes", 150.99, "https://www.amazon.com/perfumes"));
    catalog.add(new Virtual_Product("Baskets", 15.89, "https://www.amazon.com/Basket"));

   catalog.add(new Physical_Product("Pistol", 90, 10.8));
    catalog.add(new Physical_Product("Dashboard", 200, 169.8));
    catalog.add(new Physical_Product("Bags", 20, 18.0));


    print.print("---------------------------------------------------Enter the appropriate value to proceed---------------------------------------------------");
print.print("1. Get all products in catalog");
print.print("2. Search for product available in catalog");
 print.print("3. Get product by index");
 Scanner scanner = new Scanner(System.in);
userValue = scanner.nextInt();
    ClearScreen clearScreen = new ClearScreen();
    clearScreen.clearScreen();
    if (userValue == 1) {
        for (Product i : catalog)
        {
            System.out.println("-----------------------Product Info-----------------------");
            i.displayInfo();
            System.out.println();
        }
    } else if (userValue == 2) {
        final String searchString;
        System.out.println("-----------------------Search-----------------------");
print.print("Enter the name of the product");
searchString = scanner.nextLine();
if (catalog.contains(searchString))
{
    print.print("Item(s) found.");


}else print.print("Not found!");



    } else if (userValue == 3) {
        int index;
        System.out.println("-----------------------Product At Index-----------------------");
        print.print("Enter product index");
        index = scanner.nextInt();
        print.print (catalog.get(index));
    } else if (userValue <1 && userValue>3) {
        print.print("Invalid input, Try again!");
    }

    else ;

}