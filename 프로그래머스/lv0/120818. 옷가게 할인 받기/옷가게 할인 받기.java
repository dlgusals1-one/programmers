class Solution {
    public int solution(int price) {
        int answer = 0;
        answer = price >= 500000 ? price * 4/5 :
        price >= 300000 ? price * 9/10 :
        price >= 100000 ? price * 19/20 :
        price;
        return answer;
    }
}