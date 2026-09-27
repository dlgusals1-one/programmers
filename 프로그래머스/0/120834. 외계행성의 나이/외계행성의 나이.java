class Solution {
    public String solution(int age) {
        String arr = Integer.toString(age);
        String answer = "";
        char[] ch = new char[arr.length()];
        for(int i = 0; i < arr.length(); i++){
            ch[i] += 49 + arr.charAt(i);
            answer += ch[i];
        }
        return answer;
    }
}