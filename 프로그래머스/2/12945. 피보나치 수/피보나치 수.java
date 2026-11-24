class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 1;
        int sum3 = 0;
        for(int i = 0; i < n-1; i++){
            sum3 = (sum1+sum2)%1234567;
            sum1 = sum2;
            sum2 = sum3;
        }
        return sum3;
    }
}