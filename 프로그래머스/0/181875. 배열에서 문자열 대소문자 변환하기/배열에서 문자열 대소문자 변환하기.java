class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        if(strArr.length%2!=0){
            answer[0] = strArr[0].toLowerCase();
            for(int i = 1; i < answer.length-1; i+=2){
            answer[i] = strArr[i].toUpperCase();
            answer[i+1] = strArr[i+1].toLowerCase();
        }
        }else{
        for(int i = 0; i < answer.length-1; i+=2){
            answer[i] = strArr[i].toLowerCase();
            if(i+1 < answer.length)answer[i+1] = strArr[i+1].toUpperCase();
        }
        }
        return answer;
    }
}