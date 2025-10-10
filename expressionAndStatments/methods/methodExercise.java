package expressionAndStatments.methods;

public class methodExercise {
    public static void main(String[] args)
    {
        System.out.println(displayPosition("Fauzan", calculatePosition(501)));
        System.out.println(displayPosition("Alice", calculatePosition(1200)));
        System.out.println(displayPosition("Bob", calculatePosition(250)));
        System.out.println(displayPosition("Charlie", calculatePosition(75)));
        System.out.println(displayPosition("Diana", calculatePosition(25)));
    }
    
    public static int calculatePosition(int playerScore)
    {
        if(playerScore >=1000)
        {
            return 1;
        } else if (playerScore >=500 && playerScore < 1000)
        {
            return 2;
        } else if (playerScore >=100 && playerScore <500)
        {
            return 3;
        } else if (playerScore >=50 && playerScore <100)
        {
            return 4;
        }
        else 
        {
            return 5;
        }
    }   
    
    public static String displayPosition(String playerName, int position) {
        return playerName + " managed to get into position " + position + " on the leaderboard";
    }
}
