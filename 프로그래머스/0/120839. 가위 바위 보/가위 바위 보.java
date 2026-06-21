class Solution {
    public String solution(String rsp) {
        String answer = "";
        char a;
        for(int i = 0; i < rsp.length(); i++){
            a = rsp.charAt(i);
            if(a == '2') answer += "0";
            else if(a == '0') answer += "5";
            else if(a == '5') answer += "2";
        }
        return answer;
    }
}