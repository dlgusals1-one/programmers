class Solution {
    public int solution(int a, int b) {
        int answer = 0;
         if (a * b % 2 != 0){
            answer = a*a + b*b;
        }else if((a + b) % 2 != 0){
            answer = (a + b) * 2;
        }
        else{
        return Math.abs(a - b);
    }
        return answer;
    }
}