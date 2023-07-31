import java.util.Scanner;
class conditional02_evenodd
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        int  m=sc.nextInt();
        String r= m%2==0? "Even":"Odd";
        System.out.println(r);
    }
}
