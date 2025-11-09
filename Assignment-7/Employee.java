import java.util.*;
class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    double calculateSalary() { return baseSalary; }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    double calculateSalary() { return baseSalary + 5000; }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    double calculateSalary() { return baseSalary * 0.5; }
}

class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee("Amit", 20000));
        list.add(new PartTimeEmployee("Riya", 20000));
        for (Employee e : list)
            System.out.println(e.name + " Salary: " + e.calculateSalary());
    }
}
