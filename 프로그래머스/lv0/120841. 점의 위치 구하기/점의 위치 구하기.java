class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] <= -1 && dot[1] <= -1){
            answer = 3;
        }else if(dot[0] <= -1 && dot[1] >= 1){
            answer = 2;
        }else if(dot[0] >= 1 && dot[1] <= -1){
            answer = 4;
        }else if(dot[0] >= 1 && dot[1] >= 1){
            answer = 1;
        }
        int s = 65;
        char a = (char)s;
        for(int j;; j++){
           answer = a;
            break;
        }
        return answer;
    }
}