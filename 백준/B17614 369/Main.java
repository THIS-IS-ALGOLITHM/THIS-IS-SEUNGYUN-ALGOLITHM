package 아지트.오늘은0315;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            int n = i; // 큰 수를 갖고 있을 변수
            int k; // 가장 작은 값을 갖고 있을 변수
            while(n != 0) { //n을 10의 배수로 쪼개고 쪼갰을 때 더 나뉘어 지지 않으면 종료
                k = n % 10;
                n /= 10;

                if(k == 3 || k == 6 || k == 9) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
