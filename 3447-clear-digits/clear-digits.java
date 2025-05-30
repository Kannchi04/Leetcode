class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i <s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<stack.size(); i++){
            char c = stack.get(i);
            sb.append(c);
        }
        String result = sb.toString();
        return result;
    }
}