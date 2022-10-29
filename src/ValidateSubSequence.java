public class ValidateSubSequence {
    public static void main(String[] args) {
        int arr[]={5,1,22,25,-1,8,10};
        int sequence[]={1,6,-1,10};
        System.out.println(ValidateSubSequence.isValidSubsequence(arr,sequence));
    }
        private static boolean isValidSubsequence(int[] array,int[] sequence) {
            boolean status=false;
            int index=0;
            for(int i=0;i<array.length;i++){
                    if(array[i]==sequence[index]){
                        status=true;
                        return status;
                    }
                }
            return status;
        }
}
