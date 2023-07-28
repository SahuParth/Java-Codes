import java .util.Scanner;
class Big_highest_marks
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int big=0;

        for(int x=1;x<=5;x++)  
        {
            System.out.println("Enter marks in subject "+x);
            int m =sc.nextInt();
            if(m>big)/*(50>0) Store 50 in big because 50 is greater than 0 and so on 
            if the number increse the value of variable also increse*/
            {
                big=m;
            }
        }
        System.out.println("Highest marks = "+big);
    
        }
    }
        