class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] copy = letter.split(" ");
        String[] morse = {
    ".-", "-...", "-.-.", "-..", ".", "..-.",
    "--.", "....", "..", ".---", "-.-", ".-..",
    "--", "-.", "---", ".--.", "--.-", ".-.",
    "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--.."
};
        for(int i = 0;i < copy.length;i++){
        char sen = 'a';
            for(int j = 0; j < morse.length; j++){
                if(copy[i].equals(morse[j])){
                    answer += sen;
                }
                sen++;
            }
        }
        return answer;
    }
}