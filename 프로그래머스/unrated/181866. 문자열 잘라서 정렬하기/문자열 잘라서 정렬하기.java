import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        
        String[] splitArr = myString.trim().split("x");
        Arrays.sort(splitArr);
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(splitArr));
        strList.removeIf(String::isEmpty);
        
        return strList.toArray(new String[strList.size()]);
    }
}
