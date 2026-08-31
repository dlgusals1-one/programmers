import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        char[] arr = new char[my_string.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = my_string.charAt(i);
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] <= '9'&&arr[i] >= '0')count++;
        }
        int[] answer = new int[count];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i]-48;
        }
        return answer;
    }
}