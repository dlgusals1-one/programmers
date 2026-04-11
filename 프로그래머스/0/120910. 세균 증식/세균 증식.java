class Solution {
    public int solution(int n, int t) {
        int answer = 0;
       
        for(int a = 1;a <= t; t--){
         n *= 2;
            answer = n;
        }
       
        return answer;
    }
}