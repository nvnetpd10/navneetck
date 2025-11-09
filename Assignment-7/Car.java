class Car {
    String model;
    double price;
    Car(String model) {
        this.model = model;
    }
    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
    public static void main(String[] args) {
        Car c1 = new Car("Swift");
        Car c2 = new Car("BMW", 5000000);
        System.out.println(c1.model + " " + c1.price);
        System.out.println(c2.model + " " + c2.price);
    }
}
