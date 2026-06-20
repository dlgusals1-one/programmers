class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = new int[num_list.length];
        int b = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % n == 0){
                a[b] = num_list[i];
                b++;
            }
        }
        int[] answer = new int[(b)];
        for(int l = 0; l < answer.length; l++){
            answer[l] = a[l];
        }
        return answer;
    }
}