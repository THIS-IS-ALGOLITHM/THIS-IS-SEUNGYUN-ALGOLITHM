package 없는숫자더하기;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] n1 = {1,2,3,4,6,7,8,0};
        System.out.println(solution(n1));

        int[] n2 = {5,8,4,0,6,7,9};
        System.out.println(solution(n2));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers); //0~9로 정렬됨.

        for (int i = 0, j = 0; i < 10; i++, j++) {
            if (j >= numbers.length -1) j = numbers.length -1; //만약 j가 numbers의 길이가 늘어나면 고정시키기
            if (numbers[j] != i) {
                answer += i; //순서대로 정렬된 것 중에 빈자리가 있으면 더하기
                j--; //for문에서 j++되는 것을 막기 위해 추가했음.
            }
        }

        return answer;
    }

    /*
    우와.. 다른 사람 풀이보니까 int sum = 45로 해놓고
    리스트에 있는 값을 지워갔다..
     */

}
