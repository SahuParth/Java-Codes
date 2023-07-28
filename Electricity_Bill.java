import java.util.Scanner;
class Electricity_Bill
{
    public static void main (String[]args)
    { 
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of units");
        int u =sc.nextInt();
        if(u>=0 && u<=100)
        {
            double r =300+(u)*3.5;
            System.out.println("Bill = Rs "+r);
        }
        else if(u>=101 && u<=300)
        {
            double r =300+100*3.5+(u-100)*4;
            System.out.println("Bill = Rs "+r);
        }
        else if (u>=301)
        {
            double r=300+100*3.5+200*4+(u-300)*4.5;
            System.out.println("Bill = Rs "+r);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}