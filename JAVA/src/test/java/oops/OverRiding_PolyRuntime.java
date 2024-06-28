package oops;

// Runtime polymorphism occurs when a subclass provides a specific implementation of a method
// that is already defined in its superclass.
// The method to be executed is determined at runtime based on the actual type of the object.


// Superclass
//class Employee {
//    String name;
//    double baseSalary;
//
//    Employee(String name, double baseSalary) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//
//    // Method to calculate salary (to be overridden by subclasses)
//    void calculateSalary() {
//        System.out.println("Calculating salary for employee: " + name);
//        // Default calculation based on base salary
//        double salary = baseSalary;
//        System.out.println("Base salary: $" + salary);
//    }
//}
//
//// Subclass representing a regular employee
//class RegularEmployee extends Employee {
//    double bonus;
//
//    RegularEmployee(String name, double baseSalary, double bonus) {
//        super(name, baseSalary);
//        this.bonus = bonus;
//    }
//
//    // Overriding method to calculate salary for regular employees
//    @Override
//    void calculateSalary() {
//        super.calculateSalary(); // Invoke superclass method if needed
//        // Additional calculation for bonus
//        double totalSalary = baseSalary + bonus;
//        System.out.println("Total salary with bonus: $" + totalSalary);
//    }
//}
//
//// Subclass representing a manager
//class Manager extends Employee {
//    double bonus;
//    double incentive;
//
//    Manager(String name, double baseSalary, double bonus, double incentive) {
//        super(name, baseSalary);
//        this.bonus = bonus;
//        this.incentive = incentive;
//    }
//
//    // Overriding method to calculate salary for managers
//    @Override
//    void calculateSalary() {
//        super.calculateSalary(); // Invoke superclass method if needed
//        // Additional calculation for bonus and incentive
//        double totalSalary = baseSalary + bonus + incentive;
//        System.out.println("Total salary with bonus and incentive: $" + totalSalary);
//    }
//}
//
//public class OverRiding_PolyRuntime {
//    public static void main(String[] args) {
//        Employee emp1 = new RegularEmployee("John Doe", 50000, 5000);
//        Employee emp2 = new Manager("Jane Smith", 60000, 8000, 10000);
//
//        emp1.calculateSalary(); // Calls calculateSalary() of RegularEmployee
//        emp2.calculateSalary(); // Calls calculateSalary() of Manager
//    }
//}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>   2 >>>>>>>>>>>>>>>>>>>>>>>>

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Overriding the makeSound method of Animal
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound method of Animal
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class OverRiding_PolyRuntime {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Creating Dog object
        Animal myCat = new Cat(); // Creating Cat object

        myDog.makeSound(); // Output: Bark (calls Dog's makeSound method)
        myCat.makeSound(); // Output: Meow (calls Cat's makeSound method)
    }
}
