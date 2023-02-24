/* input:<h1>Shalima</h1>
   output:Shalima*/


import java.util.*;

public class epam1 
{
     public static void main(String[] args) 
     {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='<')
            {
                flag=false;
            }
            else if(str.charAt(i)=='>')
            {
                flag=true;
                continue;
            }
            if(flag==true)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
