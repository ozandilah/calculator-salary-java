package expressionAndStatments.methods;

public class methodExample1 {
    public static void main(String[] args) {
        calculateArea(50, 3.14);
        double area = calculateArea(10, 3.14);
        System.out.println("Area of circle is : "+ area);
    }   
    public static void calculateArea(double radius, double pi)
    {
        double result = radius * pi;
        System.out.println("Area of circle is : "+ result);
    }
}
