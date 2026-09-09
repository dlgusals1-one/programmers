import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int copy = n;
        int copy2 = n;
        int count = 0;
        Arrays.sort(array);
        for(;;){
        for(int i = 0;i < array.length;i++){
            if(array[i] == copy2) {
                return copy2;
            }
            else if(array[i] == copy) {
                return copy;
            }
        }
            copy++;
            copy2--;
        }
    }
}