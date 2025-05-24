	//For loop

    
    import java.util.Scanner;
class j17{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n; i++) {
        
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
          
                if(i%2!=0){
            System.out.println(i+"is odd");
           }
        
        }
        
        }
    }

    

   


