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

        for (int i = 0; i < n; i++) {
            String row = Integer.toBinaryString(inputArr1[i] | inputArr2[i]); //이진수로 바꾸어 비트 논리 연산
            row = String.format("%"+n+"s", row); // 나머지는 공백으로 채움 -> 변환할 필요 X

            row = row.replace("0", " ");
            row = row.replace("1", "#");

            answer[i] = row;
        }

        return answer;
    }

}
