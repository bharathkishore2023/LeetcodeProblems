import java.util.*;
public class SortedSquaredArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer> elementsWithoutDuplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            elementsWithoutDuplicates.add(arr[i]);
        }
        for (int i : elementsWithoutDuplicates) {
            System.out.println(i);
        }
    }
}