	//while loop

    import java.util.Scanner;
    class j19{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        while (true) {
            if (number % 2 != 0) {
                System.out.println("The number is odd.");
            } else {
                System.out.println("The number is even.");
            }
           break;
        }
        
        
    }
}

