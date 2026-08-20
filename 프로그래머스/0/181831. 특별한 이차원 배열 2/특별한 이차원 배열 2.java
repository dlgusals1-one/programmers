class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        int count = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j]!=arr[j][i]) count--; 
            }
        }
        if(count != arr.length) return 0;
        return answer;
    }
}