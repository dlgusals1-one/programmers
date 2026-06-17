class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String st;
        String str;
        String ab;
         st = Integer.toString(a);
         str = Integer.toString(b);
         ab = st + str;
         String ba = str + st;
        int temp = Integer.parseInt(ab);
        int temp1 = Integer.parseInt(ba);
        if(temp >= temp1) answer = temp;
        else answer = temp1;
        return answer;
    }
}