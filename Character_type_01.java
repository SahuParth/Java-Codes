import java.util.Scanner;
class Character_type_01
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        if (ch>='A' && ch<='Z')
        {
            System.out.println("Uppercase Alphabet");
        }
        else if (ch>='a' && ch<='z')
        {
            System.out.println("Lowercase Alphabet");
        }
        else if (ch>='0' && ch<='9')
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("Special Character");
        }
    }
}