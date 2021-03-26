package classworks;

public class Solution {

    public static void main(String[] args) {
        System.out.println(alternateString("apple"));
    }

    public static String alternateString(String str) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (i % 2 == 0){
                if (strArray[i] >= 'a' && strArray[i] <= 'z'){
                    strArray[i] = (char)(strArray[i] - 32);
                }
            }else{
                if (strArray[i] >= 'A' && strArray[i] <= 'Z'){
                    strArray[i] = (char)(strArray[i] + 32);
                }
            }
        }
        return new String(strArray);
    }


}
