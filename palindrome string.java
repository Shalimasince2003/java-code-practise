import java.util.*;
class Abc
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String p=s.next();
    StringBuilder input1=new StringBuilder();
    input1.append(p);
    input1.reverse();
    String k=input1.toString();
    if(p.equals(k))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
