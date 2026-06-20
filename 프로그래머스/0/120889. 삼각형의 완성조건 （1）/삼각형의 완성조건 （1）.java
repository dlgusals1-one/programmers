class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        if ( sides[0] >= sides[1] && sides[0] >= sides[2]){
            if(sides[0] < (sides[2] + sides[1])){
                answer = 1;
            }
        } else if ( sides[1] >= sides[0] && sides[1] >= sides[2]){
            if(sides[1] < (sides[0] + sides[2])){
                answer = 1;
            }
        } else if ( sides[2] >= sides[1] && sides[2] >= sides[0]){
            if(sides[2] < (sides[0] + sides[1])){
                answer = 1;
            }
        }
            
        return answer;
    }
}