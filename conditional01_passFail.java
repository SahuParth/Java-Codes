import java.util.Scanner;
class conditional01_passFail
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a marks ");
        int  m=sc.nextInt();
        String r= m>=40? "Pass":"Fail";
        System.out.println(r);
    }
}

        
        
            
        