class Solution {
    public int[] solution(int n) {
        int a = 0;
        for(int i = 1; i <= n/2; i++ ){
            if(n % i == 0){
                a++;
            }
        }
        int[] answer = new int[a + 1];
        int b = 0;
        for(int l = 1; l < n; l++){
            if(n % l == 0){
                answer[b] = l;
                b++;
            }
        }
        answer[a] = n;
        return answer;
    }
}