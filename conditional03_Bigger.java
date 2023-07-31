import java.util.Scanner;
class conditional03_Bigger
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a 1st no.  ");
        int  n1=sc.nextInt();
        System.out.println("Enter a 2nd no.");
        int  n2=sc.nextInt();
        int r= n1>n2? n1:n2;
        System.out.println("Bigger is "+r);
    }
}
