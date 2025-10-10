/**
 * Nested if-then-else Concept Exercise
 * 
 * This Java program demonstrates the use of nested if-else statements through a class named MarkChecker.
 * It declares an integer variable named 'mark' and initializes it with a constant value of 100.
 * The program evaluates the value of 'mark' using conditional statements to determine and print appropriate messages.
 * 
 * Key Features:
 * - Declares and initializes 'mark' to 100, keeping this value constant.
 * - Uses an if statement to check if 'mark' is greater than or equal to 50.
 *   - If true, prints "You passed."
 *   - Additionally, if 'mark' equals 100, prints "Perfect!"
 * - If the initial condition is false, executes the else block and prints "You failed."
 * 
 * This exercise illustrates basic control flow with nested conditions in Java.
 */

```java
public class MarkChecker {
    public static void main(String[] args) {
        int mark = 100;
        
        if (mark >= 50) {
            System.out.println("You passed.");
            if (mark == 100) {
                System.out.println("Perfect!");
            }
        } else {
            System.out.println("You failed.");
        }
    }
}
```