import java.util.Scanner;
class Character_type_03
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        if (Character.isUpperCase(ch))
        {
            System.out.println("Uppercase Alphabet");
        }
        else if (Character.isLowerCase(ch))
        {
            System.out.println("Lowercase Alphabet");
        }
        else if (Character.isDigit(ch))
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("Special Character");
        }
    }
}