class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a) + Integer.toString(b);
        if(Integer.parseInt(c) > a*b*2) answer = Integer.parseInt(c);
        else answer = a*b*2;
        return answer;
    }
}