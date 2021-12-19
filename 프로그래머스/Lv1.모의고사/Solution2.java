import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] scores1 = {1, 2, 3, 4, 5};
        System.out.println("==============test1============");
        System.out.println(solution(scores1));

        int[] scores2 = {1, 3, 2, 4, 2};
        System.out.println("==============test2============");
        System.out.println(solution(scores2));

        int[] scores3 = {5, 4, 3, 2, 1, 3, 3, 2, 4, 5, 1};
        System.out.println("==============test3============");
        System.out.println(solution(scores3));

        int[] scores4 = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3};
        System.out.println("==============test4============");
        System.out.println(solution(scores4));

    }

    public static List<Integer> solution(int[] answers) {
        int[] hitCount = {0, 0, 0};
        int[][] answerPattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                int order = j % answerPattern[i].length;
                if (answerPattern[i][order] == answers[j]) hitCount[i]++;
            }
        }
        int max = Math.max(hitCount[0], Math.max(hitCount[1], hitCount[2]));

        List<Integer> pass = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == hitCount[i]) {
                pass.add(i+1);
            }
        }

        return pass;
    }
}
