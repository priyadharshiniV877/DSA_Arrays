import java.util.*;
class SecondLargestElement{
    public static int findSL(int[] arr){
        int lar=Integer.MIN_VALUE;
        int slar=lar;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar && arr[i]>slar){
                slar=lar;
                lar=arr[i];
            }
            else if(arr[i]<lar && arr[i]>slar){
                slar=arr[i];
            }
        }
        return slar;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest element:"+findSL(arr));
    }
}