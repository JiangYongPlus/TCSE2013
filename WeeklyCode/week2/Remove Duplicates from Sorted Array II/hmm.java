public class Solution {
    public int removeDuplicates(int[] A) {
        int index = 0;
        for(int i=0;i<A.length;i++){
            if(i >= A.length-2 || A[i]!=A[i+2]){
                A[index++] = A[i];
            }
        }
        return index;
    }
}