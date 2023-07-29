import java.util.Scanner;
class Biggest
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        System.out.println("Enter a third number");
        int c=sc.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println("Biggest is "+a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println("Biggest is "+b);
        }
         else 
        {
            System.out.println("Biggest is "+c);
        }
       
    }
}
        
            