class Solution {
    public int[] quickSort(int[] nums) {
    int n=nums.length;
    int low=0;
    int high=n-1;
    quicksort(nums,low,high);
    return nums;
    }
    public static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
        int pivot_index=partition(arr,low,high);
        quicksort(arr,low,pivot_index-1);
        quicksort(arr,pivot_index+1,high);
        }
    }
    public static int partition(int arr[],int low,int high)
    {
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<=high;j++)
        {
            if(arr[j]<arr[high])
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}