import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!answer.contains(numbers[i] + numbers[j]))
                    answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}