package 약수의개수와덧셈;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
        System.out.println(solution(1, 2));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 1; //자기 자신은 무조건 약수로 가짐

            for (int j = 1; j < i; j++) {
                if (i % j == 0) { //j가 i의 약수면 ++
                    count++;
                }
            }

            if (count % 2 == 0) answer += i; //약수가 짝수면 더하고
            else answer -= i;// 홀수면 빼기
        }

        return answer;
    }
}
