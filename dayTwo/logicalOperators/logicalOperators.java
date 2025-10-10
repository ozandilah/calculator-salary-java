package dayTwo.logicalOperators;

public class logicalOperators {
    public static void main(String[] args) {
        int age = 19;
        
        // if(age > 18){
        //     // System.err.println("Condition true");
        // }

        String gender = "male";

        // if(gender == "male"){
        //     // System.err.println("Gender is male");
        // }
        if(age > 18 && gender == "male"){
            System.err.println("Condition true and Gender is male");
        }
    }
}
