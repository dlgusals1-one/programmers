class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
         double b = 0;
        for(int a = 0 ; a < numbers.length;a++){
          
            b += numbers[a];
            if (a == numbers.length - 1){
                answer = b / numbers.length;
            }
            }
        
        return answer;
    }
}