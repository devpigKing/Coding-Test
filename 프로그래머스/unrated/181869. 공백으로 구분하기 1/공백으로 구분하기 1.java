import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        return list.toArray(new String[0]);
    }
}