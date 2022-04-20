package 아지트.오늘은0420;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11052
public class DP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        //편의를 위해 배열을 1부터 시작하도록 했다.
        int[] p = new int[n + 1]; //가격
        int[] d = new int[n + 1]; //카드 n개를 구매할 수 있는 경우의 최대 비용

        //각 패키지의 가격을 받는다.
        for (int i = 1; i <= n; i++) {
            p[i] = scanner.nextInt();
        }
        scanner.nextLine();

        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j++) {
                int price = p[j] + d[i - j];
                /*
                 j 패키지 + i-j번째의 최대 비용
                 */
                if (d[i] < price) {
                    d[i] = price;
                }
            }
        }

        System.out.println(d[n]);
    }
}
