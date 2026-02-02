/* 
Variables

String name = "John";
System.out.println(name);
int myNum = 15;
System.out.println(myNum);
myNum = 20;
System.out.println(myNum + " <-- This is a number");
int x = 5, y = 10, z = 15;
x = y = z = 50;
System.out.println(x + y + z);
boolean Ahaan = false;

Naming conventions:
- Variables must have unique names
- Should be descriptive
- Can contain letters, digits, _, and $
- Should start with a lowercase letter
- Names are case sensitive - myVar and myvar are different
 */

/*
Strings

String name = "Arnav";

String methods:
- name.equals("Arnav") --> true
- name.equalsIgnoreCase(arnav) --> true
- name.length() --> 5
- name.charAt(2) --> n 
- name.indexOf("n") --> 2 
- name.isEmpty() --> false
- name.toUpperCase() --> ARNAV
- name.toLowerCase() --> arnav
- name.trim() <-- removes all spaces from string
- name.replace("a", "e") --> Ernev

Formatted Strings

System.out.printf("Happy Birthday dear %s!" name); <-- review this more
 */

/*
For loops

for(initialization of counter: int i = 0; Condition: i < 10; Step: i++) {
}

Step:
- Increment: i++ or i+=(a number)
- Decrement: i-- or i-=(a number)

You can also set i equal to a variable!
(Also, side note, i can be named anything)

For loops with strings instead of numbers

for(String string : strings) {
}
 */

/*
While Loops

Scanner scanner = new Scanner(System.in);

String name = "";

while(name.isEmpty()){
    System.out.print("Enter your name: ");
    name = scanner.nextLine();
}

System.out.println("Hello " + name);

scanner.close();

or 

Scanner scanner = new Scanner(System.in);

String response = "";

while(!response.equals("Q")){
    System.out.println("You are playing a game: ");
    System.out.print("Press Q to quit: ");
    name = scanner.next().toUpperCase();
}

System.out.println("You have quit the game.")

scanner.close();

Do While Loop (executes inner statement once and then checks)

do{
    System.out.println("Your age can't be negative");
    System.out.print("Enter your age: ");
    age = scanner.nextInt();
}while(age < 0);
 */

/*
Logical Operators

&& <-- AND
|| <-- OR
! <-- NOT
 */

/*
Scanner

import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = scanner.nextLine();

System.out.println("Your name is: " + name);

scanner.close()

You can also use:
- scanner.nextInt(); <-- to get an integer
- scanner.next(): <-- to get the next text before a space (if there is one)
- scanner.nextDouble(); <-- to get decimal values
- scanner.nextBoolean(); <-- to get booleans

Accepting a number and then accepting a string

scanner.nextInt();
scanner.nextLine();

scanner.nextLine();

Essentially, the enter after the integer counts as the string in nextLine, so this can be fixed by simply adding another nextLine
check without assigning it to a variable
 */

/*
Methods (place outside of the public static void main)

static void happyBirthday() {
    System.out.println("Happy Birthday to you!");
    System.out.println("Happy Birthday dear you!");
    System.out.println("You are x years old!");
    System.out.println("Happy Birthday to you!\n");
}

Call the above method with: happyBirthday()

Methods are not familiar with variables in other methods!
To use variables in other methods, set up the method like below  (with an argument):

static void happyBirthday(String name) {
    System.out.println("Happy Birthday to you!");
    System.out.println("Happy Birthday dear you!");
    System.out.println("You are x years old!");
    System.out.println("Happy Birthday to you!\n");
}

Then, to call this, you can do: happyBirthday(name) <-- with name as an assigned variable in the method you are calling happyBirthday from
You can also add multiple arguments with mutliple variable types!

static double square(double number) {
    return number * number;
}

Above is a method that returns a value, which is why it is not a static void and instead is a static double (since double is the return type)
The above method can also easily be written in one line: 

static double square(double number) {return number * number;}
 */

/*
ArrayLists

import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();

list.add(3);
list.add(1);
list.add(2);

System.out.println(list);

ArrayList<String> fruits = new Arraylist<>();

fruits.add("Apple");
fruits.add("Orange");

ArrayList methods

fruits.add();
fruits.remove(1); <-- removes value at index
fruits.set(1, "Pineapple"); <-- replaces value at index with given value
fruits.size(); <-- returns the amount of elements 

import java.util.Collections

Collections.sort(fruits); <-- alphabetically sorts the ArrayList

for(String fruit : fruits) {
    System.out.println(fruit);
}

The above for loop iterates through the Arraylist
 */

/*
Object Oriented Programming

public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
    }

    void stop(){
        isRunning = false;
    }
}

To create a car object, write:

Car car = new Car();

To get a specific part of the object:

car.model / car.year (etc.)

System.out.println(car.isRunning());
car.start();
System.out.println(car.isRunning());

Constructors

public class Student {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
}
 */

