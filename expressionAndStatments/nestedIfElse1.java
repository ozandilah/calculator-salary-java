package expressionAndStatments;

public class nestedIfElse1 {
    public static void main(String[] args) {
        int purchaseAmount = 120;
        String isMember = "Yes";
        if(purchaseAmount > 100) 
        {
            if(isMember == "Yes")
            {
                System.out.println("You are eligible for a 10% discount");
            }
            else
            {
                System.out.println("You are eligible for a 5% discount");
            }
        } else
        {
            System.out.println("You are not eligible for a discount");
        }
    }
}
