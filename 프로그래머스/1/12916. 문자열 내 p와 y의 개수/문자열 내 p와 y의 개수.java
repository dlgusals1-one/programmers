class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String S = s.toLowerCase();
        int count = 0;
        int Count = 0;
        for(int i = 0; i < s.length(); i++){
            if(S.charAt(i) == 'y') count++;
            if(S.charAt(i) == 'p') Count++;
        }
        if(count != Count) answer = false;
        return answer;
    }
}