package arrays;

public class subarrays {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int ts=15;
        int curr_sum=0;
        int min_sum=Integer.MAX_VALUE;
        int max_sum=Integer.MIN_VALUE;
        int b[]=new int[15];
        for(int i=0;i<a.length;i++)
        {
            int start=i;
            
            for(int j=i;j<a.length;j++)
            {
            int end=j;
            for(int k=start;k<=end;k++)
            {
                curr_sum=curr_sum+a[k];
            }
            System.out.println(curr_sum);
            System.out.println();
            max_sum=Math.max(max_sum,curr_sum);
            min_sum=Math.min(min_sum,curr_sum);
            curr_sum=0;
            
        }
      
    }
    System.out.println();
    System.out.println(min_sum);
    System.out.println(max_sum);
}
}
/*  10

30

60

100

150

20

50

90

140

30

70

120

40

90

50


10
150
*/
