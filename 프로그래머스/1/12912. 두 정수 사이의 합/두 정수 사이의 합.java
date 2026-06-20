class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i = -10000000;
        if(a > b){
            for(; i <= a; i++){
                if(i >= b){
                     answer += i;
                }
            }
        }else if(b > a){
            for(; i <= b; i++){
                if(i >= a){
                     answer += i;
                }
        }
        }else if(a == b){
            answer = a;
        }
        return answer;
    }
}
