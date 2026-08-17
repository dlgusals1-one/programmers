class Solution {
    public String[] solution(String[] names) {
        // int count = 0;
        // for(int i = 0; i < names.length; i++){
        //     if(i%5==0) count++;
        // }
        // String[] answer = new String[count];
        // int idx = 0;
        // for(int i = 0; i < answer.length; i++){
        //     answer[i] = names[idx];
        //     idx += 5;
        // }
        String[] answer = new String[names.length%5 == 0 ? names.length/5 : names.length/5 + 1];
        int idx = 0;
        for(int i = 0; i < answer.length; i++, idx += 5) answer[i] = names[idx];
        return answer;
    }
}