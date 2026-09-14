class Solution {
    public int[] solution(int n, int m) {
        int copy = m*n;
        int[] answer = new int[2];
        while (m != 0) {
        int temp = m;
        m = n % m;
        n = temp;
        }
        answer[0] = n;
        answer[1] = copy/n;
        return answer;
    }
}