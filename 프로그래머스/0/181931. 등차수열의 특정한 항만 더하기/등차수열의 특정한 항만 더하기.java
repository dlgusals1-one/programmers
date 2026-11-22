class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] arr = new int[included.length];
        int answer = 0;
        int copy = a;
        int num = 0;
        for(int i = 0; i < included.length; i++){
            answer += copy;
            arr[i] = copy;
            copy+=d;
            if(!included[i]){
                answer -= arr[i];
            }         
        }
        // answer -= num*d;
        return answer;
    }
}