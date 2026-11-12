import java.util.ArrayList;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= numer1 * denom2 + numer2 * denom1; i++){
            a.add(i);
        }
        int[] answer = new int[2];
        for(int i : a){
            if((numer1 * denom2 + numer2 * denom1)%i == 0 && denom1*denom2%i == 0){
                answer[0] = (numer1 * denom2 + numer2 * denom1)/i;
                answer[1] = denom1*denom2/i;
            }
        }
        return answer;
    }
}