class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int j = 0; j < my_string.length(); j++){
            for(char i = 65; i <= 90; i++){
            if(my_string.charAt(j) == i){
                answer+=(char)(i+32);
            }else if(my_string.charAt(j) == i+32){
                answer+=(char)(i);
            }
        }
        }
        return answer;
    }
}