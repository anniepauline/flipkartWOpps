package flipkartWOpps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        double price;
        int quantity;
        double durability;
        String size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter electronic product name: ");
        name = sc.next();

        System.out.println("Enter Item Quantity: ");
        quantity = sc.nextInt();

        Electronics elect = new Electronics(name, 56.6, quantity, 5.5);
        Product pdt1 = new Product(elect);
        pdt1.addToCart(elect);

        System.out.println();

        System.out.println("Enter clothing item name: ");
        name = sc.next();

        System.out.println("Enter Item Size: ");
        size = sc.next();

        System.out.println("Enter Item Quantity: ");
        quantity = sc.nextInt();
        Clothing cloth = new Clothing(name, 56.6, quantity, size);
        Product pdt2 = new Product(cloth);
        pdt2.addToCart(cloth);

        Product.payment();
    }
}
