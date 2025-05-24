//do while loop

	import java.util.Scanner;

 class j20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println( sum);
        
    }
}
