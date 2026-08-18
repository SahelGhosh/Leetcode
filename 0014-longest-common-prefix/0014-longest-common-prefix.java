import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String[] newStr = Arrays.copyOf(strs, strs.length );

        Arrays.sort(newStr);

        StringBuilder prefix = new StringBuilder("");

        String first = newStr[0];
        String last = newStr[newStr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        for(int j=0; j<minLength; j++){
            if(newStr[0].charAt(j) == newStr[newStr.length - 1].charAt(j)){
                prefix.append(newStr[0].charAt(j));
            }
            else {
                break;
            }
        }

        return prefix.toString();
    }
}