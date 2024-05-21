import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for(String str : participant)
            participantMap.put(str, participantMap.getOrDefault(str, 0) + 1);

        for(String str : completion)
            participantMap.put(str, participantMap.get(str) - 1);

        for (Map.Entry<String, Integer> entry : participantMap.entrySet()) {
            if (entry.getValue() != 0)
                return entry.getKey();
        }

        return null;
    }
}