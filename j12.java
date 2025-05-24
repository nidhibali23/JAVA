import java.util.Scanner;

public class j12 {
    public static void main(String[] args) {
        double score;
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's score: ");
         score = scanner.nextDouble();
 
    
        
        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } 
        else if (score >= 70 && score < 90) {
            System.out.println("Grade B");
        } else if (score >= 50 && score < 60) {
            System.out.println("Grade C");
        } else if (score >= 40 && score < 50) {
            System.out.println("Grade D");
        } else if (score >= 0 && score < 30) {
            System.out.println("Grade F");
        }
        
        System.out.println(score);

        
    }
}
