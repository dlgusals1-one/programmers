class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++)if(food[i]%2 != 0) food[i]--;
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                answer += Integer.toString(i);
            }
        }
        String reversed = new StringBuilder(answer).reverse().toString();
        answer += "0";
        answer += reversed;
        return answer;
    }
}