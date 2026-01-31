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
