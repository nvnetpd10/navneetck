class Book {
    String title, author;
    double price;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Navneet", 299.99);
        System.out.println(b.title);
        System.out.println(b.author);
        System.out.println(b.price);
    }
}
