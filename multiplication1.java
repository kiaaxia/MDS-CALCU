
public class multiplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        
        System.out.println("Enter second nunber: ");
        double num2 = scan.nextDouble();
        
        double result = num1 *  num2;
        
        System.out.println("Result: " + result  );
    }
}
