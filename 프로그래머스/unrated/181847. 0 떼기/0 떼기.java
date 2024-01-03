class Solution {
    public String solution(String n_str) {
        int index = 0;
        while (index < n_str.length() && n_str.charAt(index) == '0') {
            index++;
        }

        if (index < n_str.length()) {
            return n_str.substring(index);
        } else {
            return "0";
        }
    }
}