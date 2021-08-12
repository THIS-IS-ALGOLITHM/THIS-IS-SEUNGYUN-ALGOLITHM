import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {2, 3, 2}};
        System.out.println("==============test1============");
        System.out.println("answer : " + Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int pick = commands[i][2];

            List<Integer> arr = new ArrayList<>();

            if (start == end) {
                answer[i] = array[start - 1];
                continue;
            }

            for (int j = start - 1; j < end; j++) {
                arr.add(array[j]);
            }

            arr.sort(null); //sort(null) == sort(Comparator.naturalOrder())

            answer[i] = arr.get(pick - 1);
            arr.clear();
        }

        return answer;
    }

}
