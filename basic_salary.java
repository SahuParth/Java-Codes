import java.util.Scanner;
class basic_salary
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double basic,da,hra,pf,gross,netsal;
        System.out.println("Enter the basic salary");
        basic=sc.nextDouble();
        da=basic*0.25;
        hra=basic*0.12;
        pf=basic*0.08;
        gross=basic+hra+da;
        netsal=gross-pf;
        System.out.println("basic"+basic);
        System.out.println("Dearness allowance="+da);
        System.out.println("house rent allowance="+hra);
        System.out.println("pf="+pf);
        System.out.println("gross salary="+gross);
        System.out.println("net salary="+netsal);
    }
}


  