package dayThree.TernaryOperators;

public class TernaryOperatorExam {
    public static void main(String[] args) {
        
    {
        String bikeMake = "Honda";
        boolean isImported;
        if(bikeMake == "Yamaha")
        {
            isImported = false;
        } else {
            isImported = true;
            System.out.println("This bike is imported to our country");
        }
        
        if(isImported == true) {
            System.out.println("This bike is imported");
        }else{
            System.out.println("This bike is not imported");
        }
        
    }
    }
}
