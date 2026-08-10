class Solution {
    public String[] solution(String my_string) {
        int count = 1;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == ' '){
                count++;
            }
        }
        String[] answer = new String[count];
        for(int i = 0; i < answer.length; i++){
            answer[i] = "";
        }
        int idx = 0;
        int num = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != ' '){
                answer[idx] += my_string.charAt(i);
            }else{
                idx++;
                continue;
            }
        }
        return answer;
    }
}