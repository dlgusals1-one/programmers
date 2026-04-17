class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = 1;
        for(a = 1; a <= 22360680;a++){
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