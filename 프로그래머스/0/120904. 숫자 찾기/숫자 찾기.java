class Solution {
    public int solution(int num, int k) {
        int copy = num;
        int a = 0;
        for(;copy > 0;){
            a++;
            copy /= 10;
        }
        int answer = -1;
        int count = 0;
        int idx = 0;
        while(num > 0){
            count = num%10;
            num /= 10;
            idx++;
            if(count == k&& num%10 != k) {
               return a-idx+1;
            }
            }
        
        return answer;
    }
}