interface wasd{
    public abstract String calc(int i, int j, String str);
}
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        wasd calculate = (i, j, str) -> {
            if(j - i == 1) str = "w";
            else if(j - i == -1) str = "s";
            else if(j - i == 10) str = "d";
            else str = "a";
            return str;
            };
        for(int i = 0; i < numLog.length-1; i++){
            answer += calculate.calc(numLog[i], numLog[i+1], "");
        }
        return answer;
    }
}