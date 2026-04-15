class Solution {
    public long solution(long n) {
        long answer = 0;
        int a = 1;
        for(a = 1; a <= n/2;a++){
            if(n == a*a){
                answer = (a+1)*(a+1);
                break;
            }else{
                continue;
            }
        }
       if(n != a*a){
           answer = -1;
       }
        return answer;
    }
}