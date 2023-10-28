class Product {
    String name;
    double price;
    int quantity;

    static double totalPrice;
    static double totalQuantity;

    Product(String n, double p, int q) {
        this.name = n;
        this.price = p;
        this.quantity = q;

    }

    public void addToCart(Electronics obj) {
        System.out.println(obj.getClass().getName() + " was added to cart");
        quantity += obj.quantity;
        double p = obj.price * obj.quantity;
        price += p;
        totalPrice += obj.price;
        totalQuantity += obj.quantity;
        System.out.println("Price " + price);
    }

    public void addToCart(Clothing obj) {
        System.out.println(obj.getClass().getName() + " was added to cart");
        quantity += obj.quantity;
        double p = obj.price * obj.quantity;
        price += p;
        totalPrice += obj.price;
        totalQuantity += obj.quantity;
        System.out.println("Price " + price);

    }

    static public void payment() {
        System.out.println();
        System.out.println("No of items in cart " + totalQuantity);
        System.out.println("Checkout Grande total:  " + totalPrice);
    }
}