import java.util.Scanner;
class bigger_no
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a second number");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("Bigger no. is  "+a);
        }
        else if(a<b)
        {
            System.out.println("Bigger no. is  "+b);
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
        