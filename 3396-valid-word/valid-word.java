class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowels = 0;
        int consonent = 0;
        for(char ch: word.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch)!= -1){
                    vowels++;
                }else{
                    consonent++;
                }
            }else if(!Character.isDigit(ch)){
                return false;
            }
        }
        if(vowels>= 1 && consonent>=1){
            return true;
        }else{
            return false;
        }
    }
}