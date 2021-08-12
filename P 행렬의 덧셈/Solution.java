import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println("==============test1============");
        System.out.println("answer : " + Arrays.deepToString(solution(arr1, arr2)));

        int[][] arr3 = {{1}, {2}};
        int[][] arr4 = {{3}, {4}};
        System.out.println("==============test2============");
        System.out.println("answer : " + Arrays.deepToString(solution(arr3, arr4)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

}
