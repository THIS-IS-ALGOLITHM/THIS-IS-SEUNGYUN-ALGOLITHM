public class Solution {
    public static void main(String[] args) {
        int[][] scores1 = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        System.out.println("==============test1============");
        System.out.println(solution(scores1));

        int[][] scores2 = {{50,90},{50,87}};
        System.out.println("==============test2============");
        System.out.println(solution(scores2));

        int[][] scores3 = {{70,49,90},{68,50,38},{73,31,100}};
        System.out.println("==============test3============");
        System.out.println(solution(scores3));

        int[][] scores4 = {{70, 80},{70,80}};
        System.out.println("==============test4============");
        System.out.println(solution(scores4));

    }

    public static String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < scores.length; i++) {
            int max = -1;
            int min = 101;
            int sum = 0;
            int devide = scores.length;
            double avg;

            for (int j = 0; j < scores.length; j++) {
                int score = scores[j][i];

                if (i != j) {
                    if (max < score) max = score;
                    if (min > score) min = score;
                }
                sum += scores[j][i];
            }

            if (scores[i][i] < min || scores[i][i] > max) {
                sum -= scores[i][i];
                devide--;
            }
            avg = sum / (double) devide;

            if (avg >= 90) answer.append("A");
            else if (avg >= 80) answer.append("B");
            else if (avg >= 70) answer.append("C");
            else if (avg >= 50) answer.append("D");
            else answer.append("F");
        }

        return answer.toString();
    }
}
