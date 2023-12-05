class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode; // mode를 0과 1 사이에서 toggle
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                    ret += code.charAt(i);
                }
            }
        }

        if (ret.isEmpty()) {
            return "EMPTY";
        }

        return ret;
    }
}