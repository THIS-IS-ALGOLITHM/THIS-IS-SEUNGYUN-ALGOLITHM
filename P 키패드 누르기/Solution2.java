public class Solution {
    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        System.out.println("============test1===========");
        System.out.println(solution(numbers1, hand1));

        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        System.out.println("============test2===========");
        System.out.println(solution(numbers2, hand2));

        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        System.out.println("============test3===========");
        System.out.println(solution(numbers3, hand3));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;
        for (int n : numbers) {
            if (n == 0) n = 11;

            if (n == 1 || n == 4 || n == 7) {
                answer.append("L");
                left = n;
            }
            else if (n == 3 || n == 6 || n == 9) {
                answer.append("R");
                right = n;
            }
            else {
                int leftCurrent = left;
                int rightCurrent = right;
                int leftCount = 0;
                int rightCount = 0;

                while (Math.abs(leftCurrent - n) >= 2) {
                    if (leftCurrent >= n) leftCurrent -= 3;
                    else leftCurrent +=3;
                    leftCount++;
                }
                if(n != leftCurrent) leftCount++;

                while (Math.abs(rightCurrent - n) >= 2) {
                    if (rightCurrent >= n) rightCurrent -= 3;
                    else rightCurrent +=3;
                    rightCount++;
                }
                if (n != rightCurrent) rightCount++;

                if (leftCount < rightCount) {
                    answer.append("L");
                    left = n;
                } else if (leftCount > rightCount) {
                    answer.append("R");
                    right = n;
                } else {
                    answer.append(hand.equals("left") ? "L" : "R");
                    if (hand.equals("left")) {
                        left = n;
                    } else {
                        right = n;
                    }
                }


            }
        }

        return answer.toString();
    }
}
