public class countingSort {
    public static void countingSort(int[] A ,int[] B ,int k){
        int[] C=new int[k];

        for(int i = 0; i < k; i++) {
            C[i]=0;
        }
        for(int i = 0; i <A.length ; i++) {
            C[A[i]]=C[A[i]]+1;
        }
        for (int i = 1; i < k; i++) {
            C[i]=C[i]+C[i-1];
        }
        for(int i = 0; i < A.length; i++) {
            B[C[A[i]]]=A[i];
            C[A[i]]=C[A[i]]-1;
        }
    }






}
