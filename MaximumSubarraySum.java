import java.util.*;
class MaximumSubarraySum{
    public static int findmss(int[] arr){
        int currentSum=0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            maxSum=Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Subarray Sum:"+findmss(arr));
    }
}