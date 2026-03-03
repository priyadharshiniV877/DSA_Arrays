import java.util.*;
class TwoSumProblem{
    public static int[] twoSum(int[] arr,int tar){
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int val=tar-arr[i];
            if(map.containsKey(val)){
                res[0]=i;
                res[1]=map.get(val);
                return res;
            }
            map.put(arr[i],i);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int[] result=twoSum(arr,tar);
        System.out.println(Arrays.toString(result));
    }
}