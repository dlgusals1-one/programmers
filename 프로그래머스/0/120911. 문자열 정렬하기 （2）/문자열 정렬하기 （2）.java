class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] arr = my_string.split("");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr.length-1; j++){
                if(arr[j].charAt(0) > arr[j+1].charAt(0)) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}