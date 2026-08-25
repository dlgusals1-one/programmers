class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        for(int i = 0; i < finished.length;i++){
            if(!finished[i]) idx++;
        }
        String[] answer = new String[idx];
        int idx1 = 0;
        for(int i = 0; i < finished.length; i++){
        if(!finished[i]) {
            answer[idx1] = todo_list[i];
            idx1++;
        }
        }
        return answer;
    }
}