class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String element = Integer.toString(x);
        int num = Integer.parseInt(element.substring(element.length()-1));
        for(int i = 0 ; i<element.length()-1; i++){
            num+=Integer.parseInt(element.substring(i, i+1));
        }
        if(x%num!=0) answer = false;
        return answer;
    }
}