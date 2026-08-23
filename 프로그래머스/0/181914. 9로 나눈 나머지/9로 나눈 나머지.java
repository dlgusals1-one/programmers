class Solution {
    public int solution(String number) {
        int answer = 0;
        String sum = "";
        for(int i = 0; i < number.length(); i++){
            sum = number.charAt(i) + "";
            answer += Integer.parseInt(sum);
        }
        answer %= 9;
        return answer;
    }
}