class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()-4 != 0 && s.length()-6 != 0) return false;
        for(int i = 0; i < s.length(); i++){
             char temp = s.charAt(i);
            if(temp < 48 || temp > 57) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}