class Solution {
    public String solution(String s) {
        String answer = "";
        int max = -2147483648;
        int min = 2147483647;
        String[] arr = s.split(" ");
        int[] ar = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
        ar[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(max < ar[i]) max = ar[i];
            if(min > ar[i]) min = ar[i];
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}