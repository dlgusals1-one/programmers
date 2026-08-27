class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        for(int i = 0; i < myString.length()-pat.length()+1; i++){
        if(myString.substring(i,pat.length()+i).equals(pat)){
            answer = 1;
            break;
        }
        }
        return answer;
    }
}