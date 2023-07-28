import java.util.Scanner;
class Age
{ 
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can not vote");
        }
    }}
            