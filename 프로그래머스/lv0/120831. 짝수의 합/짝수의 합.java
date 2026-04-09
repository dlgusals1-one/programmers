class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 != 0){
            n = n - 1;
        }
        for (; n >= 0; n-=2) {
            answer += n; 
        }
        
        return answer;
        
    }
}