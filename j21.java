// do while loop

import java.util.Scanner;

class j21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number between 1 and 20: ");
            num = scanner.nextInt();
            
            if (num % 2 != 0) {
                System.out.println(num + " is an odd number.");
            } else {
                System.out.println(num+ " is an even number.");
            }
        } while (num < 1 || num > 20);
        
        scanner.close();
    }
}
