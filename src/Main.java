import com.zuitt.app.StaticPoly;
import com.zuitt.app.Parent;
import com.zuitt.app.Child;
//import com.zuitt.app.*; calls all the contents of the package

import java.util.Scanner;

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

//        Handling user inputs
//        Scanner is used to handle user inputs
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.println("Please enter a number");
        try {
            num = input.nextInt(); // it waits for the next integer inputted by the user in the console
        } catch (Exception e) {
            System.out.println("Invalid input");
            e.printStackTrace(); // The error message starting from the bottom of the stack to the top
        } finally { // The finally block runs whether or not the code in the try is successful
            System.out.println("Thanks for entering a number");
//            The finally block is important if the program deals with reading files or accessing databases
//            This is where the connection to the file or database is terminated
//            Also used for highly sensitive operations by:
//            1. Ensuring safe operations for databases by closing the connection if no longer needed
//            2. Operations where users can input problematic data
//            3. Any operations that are malicious ex. downloading or saving sensitive files
        }
        System.out.println("You have inputted " + num);
    }
}
// OOP Tenets:
// Encapsulation - Private properties and Public getters/setters

// Inheritance/Composition
//    Composition - "has a" relationship
//        A car has a driver
//    Inheritance - "is a" relationship
//        A car is a vehicle

//      Inheritance can use the keyword super. Super is a reference variable that corresponds to the immediate parent of the class
//            1. Super can be used to refer to the immediate parent class' instance variable/method
//            1. super() can be used to invoke the immediate parent class constructor

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

//  Extend vs Implement
// Extend is used for inheritance, wherein a class inherits the PROPERTIES AND METHODS of another, this includes all getters/setters, constructors, and methods of the parent
// Implement is used for abstraction, wherein a class implements and interface that method names, meaning if a class uses an interface, it should define all the methods included in the interface