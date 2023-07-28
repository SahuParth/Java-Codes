import java .util.Scanner;
class tech_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int f=n/100;
        int l=n%100;
        int sum=f+l;
        double a= Math.sqrt(n);  
        if(n>1000 && n<9999)
        {
            if(sum==a)
            {
                System.out.println("Tech Number");
            }
            else if(sum!=a)
            {
                System.out.println("Not a tech number");
            }
        }
            else
            {
                System.out.println("Not a 4 digit number");
            }
        }
    }


            
