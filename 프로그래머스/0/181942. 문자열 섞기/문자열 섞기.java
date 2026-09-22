interface StringTape{
    public abstract String Tape(String[] string1, String[] string2);
}
class Solution {
    public String solution(String str1, String str2) {
        
        StringTape st = (STR1,STR2) -> {
            String str = "";
            int idx1 = 0;
            int idx2 = 0;
            for(int i = 0; i < STR1.length+STR2.length; i++){
                if(i%2==0){
                    str += STR1[idx1];
                    idx1++;
            }else {
                    str+= STR2[idx2];
                    idx2++;
            }
            }
            return str;
        };
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        
//         String answer = "";
        return st.Tape(arr1, arr2);
    }
}