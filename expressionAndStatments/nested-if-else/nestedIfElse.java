package expressionAndStatments;

public class nestedIfElse {
    public static void main(String[] args) {
        int numb = 5;

        if(numb > 0)
        {
            if(numb % 2 == 0) {
                System.out.println("Number is Positive and Even");
            } else {
                System.out.println("Number is Positive and Odd");
            }
        }else{
            System.out.println("Number is Negative");
        }
    }
}
