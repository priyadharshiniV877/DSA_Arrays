import java.util.*;
class LargestElement{
    public static int findlargest(int[] arr){
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest element:"+findlargest(arr));
    }
}