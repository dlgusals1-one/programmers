class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
          int j =0;
        for(int i = 0; i < array.length; i++){
          
            if(array[i] > height){
                j++;
            }
            if(i == array.length - 1){
                answer = j;
            }
        }
    
        return answer;
    }
}