package dayThree;

public class CheckScore {
    public static void main(String[] args) {
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
