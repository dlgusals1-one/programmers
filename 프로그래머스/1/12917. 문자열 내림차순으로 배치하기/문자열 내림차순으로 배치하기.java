class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length; i++){
            for(int j = 0; j < ch.length-1;j++){
                if(ch[j] < ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        for(char i:ch){
            answer += i;
        }
        return answer;
    }
}