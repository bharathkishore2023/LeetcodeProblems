import java.util.*;
public class AddNumbersAsLike {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 6, 5};
        int[] array3 = {4, 3, 2};
        int carry = 0;
        int sum = 0;
        ArrayList<Integer> listOfAddElements = new ArrayList<>();
        int result = 0;
        for (int i = array1.length-1; i>=0; i--) {
            sum = carry;
            sum += array1[i] + array2[i] + array3[i];
            if ((sum > 9) && (i >0)) {
                listOfAddElements.add(sum - 10);
                carry = 1;
            } else {
                listOfAddElements.add(sum);
                carry=0;
            }
        }
        for (int i = listOfAddElements.size() - 1; i >= 0; i--) {
            result =result*10 + listOfAddElements.get(i);
        }
        System.out.println("list:"+listOfAddElements);
        System.out.println("result:"+result);
    }
}