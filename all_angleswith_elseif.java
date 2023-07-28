import java.util.Scanner;
class all_angleswith_elseif
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any angle ");
        double a=sc.nextDouble();
        if (a==0)
        {
            System.out.println("Zero");
        }
        else if (a>0 && a<90)
        {
            System.out.println("Acute");
        }
        else if (a==90)
        {
            System.out.println("Right");
        }
        else if (a>90 && a<180)
        { 
            System.out.println("Obtuse");
        }
        else if (a==180)
        {
            System.out.println("Straight");
        }
        else if (a>180 && a<360)
        {
            System.out.println("Reflex");
        }
        else if (360==a)
        {
            System.out.println("Complete");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
