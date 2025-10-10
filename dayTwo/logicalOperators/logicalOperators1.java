package dayTwo.logicalOperators;

public class logicalOperators1 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 20, d = 0;

        if(a < b && b == c){
            d = a + b + c;
            System.out.println("The value of d is: " + d);
        }
    }
}
