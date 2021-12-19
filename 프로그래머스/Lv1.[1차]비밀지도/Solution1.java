import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n1 = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n1, arr1, arr2)));

        int n2 = 6;
        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(n2, arr3, arr4)));
    }

    public static String[] solution(int n, int[] inputArr1, int[] inputArr2) {
        String[] answer = new String[n];
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        for (int i = 0; i < n; i++) arr1[i] = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(inputArr1[i])));
        for (int i = 0; i < n; i++) arr2[i] = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(inputArr2[i])));

        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (arr1[i].charAt(j) == '1' || arr2[i].charAt(j) == '1') {
                    row.append("#");
                } else {
                    row.append(" ");
                }
            }
            answer[i] = row.toString();
        }

        return answer;
    }

}
