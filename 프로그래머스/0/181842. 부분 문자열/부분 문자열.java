class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int count = str1.length();
        for(int i = count; i <= str2.length(); i++){
            if(str1.equals(str2.substring(i - count, i))) answer = 1;
        }
        return answer;
    }
}