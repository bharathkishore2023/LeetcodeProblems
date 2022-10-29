/*
import java.util.*;
public class TwoNumberSum {
    public static void main(String[] args) {
        int[] arr={3,5,-4,8,11,1,-1,6};
        int targetSum=10;
        System.out.println(Arrays.toString(TwoNumberSum.twoNumberSum(arr,targetSum)));
    }
    public static int[] twoNumberSum(int[] array,int targetSum){
        Set<Integer>visitedElements=new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            if(visitedElements.contains(targetSum-array[i])){
                return new int[]{targetSum-array[i],array[i]};
            }
            visitedElements.add(array[i]);
        }
        return new int[0];
    }
}
*/
