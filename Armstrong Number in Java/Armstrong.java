import java.util.Scanner;
public  class Armstrong {
    
    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the value of n : ");
   int n = input.nextInt();
   int rem = 0;
   int k = n;
   int acc= 0;
   while( k > 0)
   {
        rem = k%10;
        acc = acc +  rem*rem*rem;
        k = k/10;

   }
   if(acc ==  n)
   System.out.println("An Armstrong number : " + n);
   else
   System.out.println("Not an Armstrong number. ");
        
   input.close();
    }

}
