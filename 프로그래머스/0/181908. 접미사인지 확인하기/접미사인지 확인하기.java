class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String copy = "";
        for(int i =0; i < my_string.length(); i++){
            copy = my_string.substring(i,my_string.length());
            if(copy.equals(is_suffix)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}