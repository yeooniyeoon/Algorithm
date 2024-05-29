import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = new int[]{1, 2, 3, 4, 5};
        int[] p2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length])
                correct[0]++;
            if (answers[i] == p2[i % p2.length])
                correct[1]++;
            if (answers[i] == p3[i % p3.length])
                correct[2]++;
        }

        int max = Arrays.stream(correct)
                .max()
                .orElseThrow(NoSuchElementException::new);
        
        for (int i = 0; i < correct.length; i++) {
            if (max == correct[i]) {
                answerList.add(i + 1);
            }
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}