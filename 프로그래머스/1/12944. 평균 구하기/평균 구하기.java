class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double j = 0;
        for(int i = 0; i < arr.length;i++){
            j += arr[i];
            if(i == arr.length -1){
                answer = j / arr.length;
            }
        }
        
        return answer;
    }
}