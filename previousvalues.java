class A{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6};
        boolean b[]=new boolean[6];
        
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]+a[i+1]==a[i+2])
            {
                b[i+2]=true;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
}
