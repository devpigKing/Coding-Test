import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        if (myString.isEmpty()) {
            return new String[0];
        }
        
        String[] result = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String re : result) {
            if (!re.isEmpty()) {
                list.add(re);
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        
        
        return answer;
    }
}