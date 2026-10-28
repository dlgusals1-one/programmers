class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] arr = before.split("");
        String[] array = after.split("");
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < arr.length; i++){
            num1 += arr[i].charAt(0);
            num2 += array[i].charAt(0);
        }
        if(num1==num2) answer = 1;
        else answer = 0;
            return answer;
    }
}