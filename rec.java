class hanoitower {
    public static void hanoi(int n,String src,String help,String dest)
    {
        if(n==1)
        {
            System.out.println("transfer disc" +n+ "from " +src+"to" +dest);
            return;
        }
        hanoi(n-1,src,dest,help);
        System.out.println(" transfer disc " +n+ "from"+src+"to" +dest);
        hanoi(n-1,help,src,dest);
    }
    public static void main(String[] args) {
        int n=3;
        hanoi(n,"S","H","D");
    }

        
    }

/*
transfer disc1from StoD
 transfer disc 2fromStoH
transfer disc1from DtoH
 transfer disc 3fromStoD
transfer disc1from HtoS
 transfer disc 2fromHtoD
transfer disc1from StoD
*/




//reverse a string





public class revstring {
    public static void rev(int n,String s) 
    {
        if(n==0)
        {
            System.out.print(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        rev(n-1,s);

    }
    public static void main(String[] args) {
        String s="shalima";
        int n=s.length()-1;
        rev(n,s);
    }
    
}

//amilahs


//find first and last element

public class stringrep {
    public static int  first = -1;
    public static int  last = -1;
    public static void findocc(int n,String s,char elem) 
    {
        if(n==s.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char Currcha = s.charAt(n);

        if(Currcha==elem)
        {
            if(first==-1)
            {
                first=n;
            }
            else
            {
                last=n;
            }
           
        }
        findocc(n+1,s,elem);
        
    }
    public static void main(String[] args) {
        String s="adddbaaakla";
        
        findocc(0,s,'a');
    }
    
}



/*
0
10
*/
