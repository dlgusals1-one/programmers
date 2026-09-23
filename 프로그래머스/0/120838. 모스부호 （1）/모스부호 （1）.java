class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
        String[] morse = {
    ".-", "-...", "-.-.", "-..", ".", "..-.",
    "--.", "....", "..", ".---", "-.-", ".-..",
    "--", "-.", "---", ".--.", "--.-", ".-.",
    "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--.."
};
        for(int i = 0; i < arr.length; i++){
            char sen = 'a';
            for(int j = 0; j < morse.length; j++){
                if(morse[j].equals(arr[i])) {
                    answer+=sen;
                    break;
                }
                sen++;
            }
            sen++;
        }
        return answer;
    }
}