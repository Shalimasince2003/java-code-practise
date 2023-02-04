import java.util.*;
import java.text.*;
class solution
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    double payment=s.nextDouble();
    s.close();
    NumberFormat n=NumberFormat.getCurrencyInstance(Locale.US);
    String us=n.format(payment);
    NumberFormat n1=NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china=n1.format(payment);
    NumberFormat n2=NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france=n2.format(payment);
    
    System.out.println("us:"+us);
    System.out.println("china:"+china);
    System.out.println("france:"+france);



    
  }
}
