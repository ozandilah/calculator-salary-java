package dayTwo;

public class logicalOperatorExercise {
    public static void main(String[] args) {
        boolean isHuman = true;
        int highestScore = 90;
        int runnerUpScore = 85;
        
        if(isHuman == false) 
        {
            System.out.println("It is not a human!");
            System.out.println(" And I am scared of aliens");
        }
        if(highestScore < 100) 
        {
            System.out.println("You got the high score!");
        }
        
        if(highestScore > runnerUpScore && highestScore < 100)
        {
            System.out.println("Greater than the runner-up score and less than 100");
        }
    }
}
