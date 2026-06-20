class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int a = 0;
        int b = 0;
        int[] arr = new int[numlist.length];
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                arr[a] = numlist[i];
                a++;
                b = i;
            }
        }
        int[] ar = new int[a];
        for(int l = 0; l < ar.length; l++){
            ar[l] = arr[l];
        }
        return ar;
    }
}