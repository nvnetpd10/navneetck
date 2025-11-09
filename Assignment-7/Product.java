class InvalidPriceException extends Exception {
    InvalidPriceException(String msg) { super(msg); }
}

class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) throws InvalidPriceException {
        if (price < 0) throw new InvalidPriceException("Price cannot be negative");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }

    public static void main(String[] args) {
        try {
            Product p1 = new Product(1, "Laptop", 50000);
            Product p2 = new Product(2, "Phone", 20000);
            Product p3 = new Product(3, "Watch", 5000);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }
    }
}
