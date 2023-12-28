class Solution {
    public String solution(String myString, String pat) {
        int patLength = pat.length();
        int myStringLength = myString.length();

        
        for (int i = myStringLength - patLength; i >= 0; i--) {
            if (myString.regionMatches(true, i, pat, 0, patLength)) {
                
                return myString.substring(0, i + patLength);
            }
        }

    
        return "";
        }
    }
