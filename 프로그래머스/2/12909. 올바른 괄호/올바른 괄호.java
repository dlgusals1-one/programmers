class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
            if(s.length()%2!=0) answer=false; 
            // else if(s.charAt(0) == ')') {
            //     answer = false;
            // }else if(s.charAt(s.length() - 1) == '('){
            //     answer = false;
            //}
            else { 
                for(int i = 0; i<s.length(); i++){
                    if(s.charAt(i) == '(') a++;
                    if(s.charAt(i) == ')') a--;
                    if(a <= -1){
                        answer = false;
                        break;  
                    } 
                }
                if(a != 0) answer = false;
            }
        
        return answer;
    }
}