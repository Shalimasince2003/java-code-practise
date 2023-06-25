public class quicksort {
    public static void printarr(int arr[]) {
        for (int i=0;i<arr.length;i++ ) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        
    }
    public static void quickSort(int arr[],int si,int ei) {
        if(si>=ei)return;
        int pivotIndex=partition(arr,si,ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);
        
    }
    public static int partition(int arr[],int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
           
        }
    //to swap pivot
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=pivot;

        return i;
        
    }
    public static void main(String[] args)
    {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length-1;
        quickSort(arr,0,n);
        printarr(arr);
    }
    
    
}
