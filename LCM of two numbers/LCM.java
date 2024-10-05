import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int first = input.nextInt();
        System.out.println("Enter the second Number: ");
        int second = input.nextInt();

        int count =1;
        int result =1;
        int max = maximum(first, second);
        int minimum  = min(first, second);
        int nature = Nature(first, second);
        if (nature == 1 && first%second != 0 && second%first != 0) 
        {
            System.out.println("LCM is : " +first * second);
            System.out.println("entered");
        }
        else
        {
            while(true)
            {
                if(max*count% minimum == 0)
                 {
                    System.out.println("LCM is : " + max*count);
                    break;
                 }
                 count++;

            }
        }

        
    }
    static int Nature(int first , int second)
{
    if(first%2 == 0 && second%2 ==  0 || first%2 != 0 && second %2 != 0 )
    return 0;
    return 1;
    
}
static int maximum(int first , int second)
{
    if(first > second)
    return first;
    return second;
}
static int min(int first , int second)
{
    if(first < second)
    return first;
    return second;
}
}

