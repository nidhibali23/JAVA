class j22 {


    static int calculator(int x, int y){
        int z;
        
       
     if(x<y){
            z = x+y;//sum
        }

        else {
         z = (x+y)*2;

        }

       return z;
    }



    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        
        c = calculator(a, b);
        System.out.println(a + " "+ b);
        
        System.out.println(c);
        
    }
}

    
