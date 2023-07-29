import java.io.*;
class buffer
{
    public static void main(String[]args)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter name"); 
        String n=br.readLine();
        System.out.println("Enter marks"); 
        int m=Integer.parseInt(br.readLine());
        System.out.println("NAME -"+n); 
        System.out.println("MARKS -"+m);
        System.out.println("Enjoying with BufferReader");
    }}
        
        
        
        
        
        