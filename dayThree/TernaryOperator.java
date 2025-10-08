package dayThree;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 20;
        String status;
        status = (age < 18) ? "Under Age" : "Senior";
        System.out.println("Status: " + status);
    }
}
