import java.util.Scanner;

public class j11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

    
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        boolean condition = num1 > num2;

        
        int result;
        if (condition) {
            result = num1 + num2; 
        } else {
            result = num1 - num2; 
        }

    
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
