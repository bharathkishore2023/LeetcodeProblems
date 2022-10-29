/*
import java.util.Scanner;
public class SumOfSubArrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int noOfElements =sc.nextInt();
        int[] arr=new int[noOfElements];
        System.out.println("expected sum: ");
        int sum=sc.nextInt();
        for(int index=0;index<noOfElements;index++){
            arr[index]=sc.nextInt();
        }
        SumOfSubArrays.sumOfArray(arr,noOfElements,sum);
    }
    private static void sumOfArray(int []arr,int n,int sum){
        int sumOfValues=0;
        for(int i=0;i<n;i++){
            sumOfValues=arr[i];
            for(int j=i+1;j<n;j++){
                if(sumOfValues>sum){
                    break;
                }
                if(sumOfValues==sum){
                    System.out.println("the indexes be : "+i +" "+j-1);
                    System.exit(0);
                }
                sumOfValues+=arr[j];
            }
        }
        System.out.println("No sub arrays found");
    }
}
*/
 /*  int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(SortedSquaredArray.sortedSquaredArray(arr)));
    }
    public static int[] sortedSquaredArray(int[]array){
        for(int i=0;i<array.length;i++){
            result[i]=
        }
        return result;
    }*/