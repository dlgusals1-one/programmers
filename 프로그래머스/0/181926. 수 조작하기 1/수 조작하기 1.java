class Solution {
    public int solution(int n, String control) {
        String[] arr = control.split("");
        for(int i = 0; i < control.length(); i++){
            n += arr[i].equals("w") ? 1 : arr[i].equals("s") ? -1 : arr[i].equals("d") ? 10 : -10;  
        }
        return n;
    }
}