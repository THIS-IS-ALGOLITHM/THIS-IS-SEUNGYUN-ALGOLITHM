import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] scores1 = {1,2,3,4,5};
        System.out.println("==============test1============");
        System.out.println(Arrays.toString(solution(scores1)));

        int[] scores2 = {1,3,2,4,2};
        System.out.println("==============test2============");
        System.out.println(Arrays.toString(solution(scores2)));

        int[] scores3 = {5,4,3,2,1,3,3,2,4,5,1};
        System.out.println("==============test3============");
        System.out.println(Arrays.toString(solution(scores3)));

        int[] scores4 = {1,1,1,1,1,2,2,2,2,2,3,3,3,3};
        System.out.println("==============test4============");
        System.out.println(Arrays.toString(solution(scores4)));

    }

    public static int[] solution(int[] answers) {
        int count = 0;
        int[] num = {0, 0, 0};

        for (int i = 0, j = 0; i < answers.length; i++) {
            int num1A = (i + 1) % 5 == 0 ? 5 : (i + 1) % 5;
            int[] num2A = {2, 1, 2, 3, 2, 4, 2, 5};
            int num3A = 0;
            switch(i % 10) {
                case 0 : case 1 : num3A = 3; break;
                case 2 : case 3 : num3A = 1; break;
                case 4 : case 5 : num3A = 2; break;
                case 6 : case 7 : num3A = 4; break;
                case 8 : case 9 : num3A = 5; break;
            }

            if (answers[i] == num1A) num[0]++;
            if (answers[i] == num2A[j]) num[1]++;
            if (answers[i] == num3A) num[2]++;

            if (j == 7) j = 0;
            else j++;
        }
        int max = (num[0] >= num[1] && num[0] >= num[2]) ? num[0] : Math.max(num[1], num[2]);
        if (max == 0) {
            return new int[0];
        }

        for (int i : num) {
            if (i == max) count++;
        }

        int[] pass = new int[count];
        for (int i = 0, j = 0; i < 3; i++) {
            if (num[i] == max) {
                pass[j++] = i+1;
            }
        }

        return pass;
    }
}
