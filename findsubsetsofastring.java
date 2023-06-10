public class findsubsets {
    public static void main(String[] args) {
        String str="abc";
        substr(str,"",0);
    }
    public static void substr(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        //yes 
        substr(str,ans+str.charAt(i),i+1);
        //no
        substr(str,ans,i+1);


    } 
    }
    

