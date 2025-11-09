import java.util.*;
class Customer {
    int id;
    String name, email;
    Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String toString() {
        return id + " " + name + " " + email;
    }
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Navneet", "navneet@mail.com"));
        list.add(new Customer(2, "Amit", "amit@mail.com"));
        list.add(new Customer(3, "Riya", "riya@mail.com"));
        for (Customer c : list) System.out.println(c);
    }
}
