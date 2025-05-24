import java.util.Scanner;

class j14{
	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
          double marks;
        System.out.print("Enter the student's marks: ");
        marks = sc.nextDouble();
        
        if (marks < 40) {
            marks += 10;
            System.out.println( marks);
        }

        // Determine the grade
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        
    }
}

	