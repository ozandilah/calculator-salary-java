package expressionAndStatments;

public class ladderIfElse2 {
    public static void main(String[] args) {
        String day = "Tuesday";

        if (day == "Monday")
        {
            System.out.println("Monday Blues");
        }
        else if (day == "Tuesday")
        {
            System.out.println("Just another Tuesday");
        }
        else if (day == "Wednesday")
        {
            System.out.println("Hump day");
        }
        else if (day == "Thursday")
        {
            System.out.println("Almost Friday");
        }
        else if (day == "Friday")
        {
            System.out.println("TGIF");
        }
        else if (day == "Saturday" || day == "Sunday")
        {
            System.out.println("Weekend");
        }
        else 
        {
            System.out.println("Invalid day");
        }
    }
}
