# OR and NOT Logical Operators Exercise

## Objective
Write a Java program that demonstrates the use of logical operators (`&&`, `||`, `!`) in conditional statements. The program should include a class named `MyHello` with a `main` method that performs various checks on integer variables.

## Requirements
1. Declare an integer variable `highScore` and assign it a value of 80.
2. Check if `highScore` is less than 100. If true, print: `"You got the high score!"`
3. Declare another integer variable `runnerUpScore` with a value of 95.
4. Use an `if` statement to check if `highScore` is greater than `runnerUpScore` **AND** `highScore` is less than 100. If both conditions are true, print: `"Greater than second top score and less than 100"`
5. Use an `if` statement with a logical **OR** operator to check if `highScore` is greater than 90 **OR** `runnerUpScore` is less than or equal to 90. If either or both conditions are true, print: `"Either or both of the conditions are true"`
6. Add a new condition that checks if both `highScore` and `runnerUpScore` are equal to 90 using logical operators. If true, print: `"Both scores are 90."` Otherwise, print: `"Scores are not equal to 90."`

## Sample Code Structure
```java
public class CheckScore {
    public static void main(String[] args)
    {
        int highScore = 80;
        int runnerUpScore = 95;
        if(highScore < 100)
        {
            System.out.println("You got the high score!");
        }
        
        if(highScore > runnerUpScore && highScore < 100)
        {
            System.out.println("Greater than second top score and less than 100");
        }
        
        if(highScore > 90 || runnerUpScore < 90)
        {
            System.out.println("Either or both of the conditions are true");
        }
        if(highScore == 90 && runnerUpScore == 90)
        {
            System.out.println("Both scores are 90");
        } else {
            System.out.println("Scores are not equal to 90.");
        }
    }
}
```

## Expected Output
Based on the given values:
- You got the high score!
- Either or both of the conditions are true
- Scores are not equal to 90.

## Notes
- Ensure the program compiles and runs without errors.
- Experiment with different values for `highScore` and `runnerUpScore` to see how the conditions behave.
- Logical NOT (`!`) can be used in additional exercises, e.g., `!(highScore == 80)` to negate a condition.