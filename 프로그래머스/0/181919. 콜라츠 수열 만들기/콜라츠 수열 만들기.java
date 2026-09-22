interface col{
    public abstract int calc(int N);
}
class Solution {
    public int[] solution(int n) {
        col even = N -> N/2;
        col odd = N -> 3*N+1;
        int[] answer = new int[1000];
        answer[0] = n;
        int i = 1;
        for(;;i++){
            if(answer[i-1]%2 == 0) answer[i] = even.calc(answer[i-1]);
            else answer[i] = odd.calc(answer[i-1]);
            if(answer[i] == 1) break;
        }
        int[] copy = new int[i+1];
        for(int j = 0; j<copy.length; j++){
            copy[j] = answer[j];
        }
        return copy;
    }
}