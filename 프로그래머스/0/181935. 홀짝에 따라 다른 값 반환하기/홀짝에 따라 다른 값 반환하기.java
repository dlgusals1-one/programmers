class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
            for(int i = 1; i <= n; i++){
                i++;
                answer += i*i;
            }
            
        }else {
                for(int l = 1; l <= n; l++){
                    answer += l;
                    l++;
                }
            }
        
        return answer;
    }
}