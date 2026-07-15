class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        while(num<=n){
            answer++;
            num*=(answer+1);
        }
        return answer;
    }
}