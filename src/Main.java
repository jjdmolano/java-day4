import com.zuitt.app.StaticPoly;
import com.zuitt.app.Parent;
import com.zuitt.app.Child;
//import com.zuitt.app.*; calls all the contents of the package

public class Main {
    public static void main(String[] args) {
//        Static Polymorphism
        StaticPoly sample = new StaticPoly();

        int sum = sample.add(7,8,9);
        System.out.println(sum);

        int prod = sample.multiply(5);
        System.out.println(prod);

//        Dynamic Polymorphism
        Parent person1 = new Parent();
        Parent person2 = new Child(); // valid because Child inherited Parent

        person1.speak(); // I am a parent
        person2.speak(); // I am also a child
    }
}
// OOP Tenets:
// Encapsulation - Private properties and Public getters/setters

// Inheritance/Composition
//    Composition - "has a" relationship
//        A car has a driver
//    Inheritance - "is a" relationship
//        A car is a vehicle

// Abstraction - Hide details and show only relevant part of a class
// Interfaces - acts as contracts wherein a class that uses and interface needs to fulfill or implement the methods
//    Uses the implements keyword on the class that uses the interface

// Polymorphism - is the ability of an object or methods to have many forms
//    Static or compile-time Polymorphism - is done by doing function/method overloading.
//        Functions can be overloaded by either changing the number of arguments and/or changing the type of arguments
//    Dynamic method dispatch or runtime polymorphism - is done by doing function/method overriding
//        Functions/methods are overridden by replacing the definition of the method of the parent by the child

//  When is static polymorphism used in real life?
//              It is typically used for functions/methods that CAN HAVE different kinds of arguments.
//              ex. System.out.println -> can print numbers, Strings, booleans and other values.


//  When is dynamic polymorphism used in real life?
//              It is typically used for replacing methods inherited from parents.
//              ex. The function of an admin for display users' details differs in output from the display of a regular user
