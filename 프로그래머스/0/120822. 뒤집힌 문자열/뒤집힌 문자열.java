class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int j = my_string.length()-1; j >= 0; j--){
            answer += my_string.charAt(j);
        }
        return answer;
    }
}