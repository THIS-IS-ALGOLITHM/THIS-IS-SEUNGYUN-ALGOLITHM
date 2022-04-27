package 아지트.오늘은0427;

import java.util.Scanner;

//머지소트
public class MergeSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aN = scanner.nextInt();
        int bN = scanner.nextInt();

        int[] a = new int[aN];
        int[] b = new int[bN];
        int a_b = aN + bN;
        StringBuilder answer = new StringBuilder();
        //출력할 때 배열에 값 하나씩 넣어서 출력하는 것보다 StringBuilder에 넣어서 한 번에 출력해주는 것이 시간이 더 적게 걸린다.

        for (int i = 0; i < aN; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.nextLine();
        for (int j = 0; j < bN; j++) {
            b[j] = scanner.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < aN && j < bN) {
            answer.append(a[i] > b[j] ? b[j++] : a[i++]);
            answer.append(" ");
        }

        if (k < a_b) {
            if (i < aN) {
                for (; i < aN; i++) {
                    answer.append(a[i]);
                    answer.append(" ");
                }
            } else {
                for (; j < bN; j++) {
                    answer.append(b[j]);
                    answer.append(" ");
                }
            }
        }

        System.out.println(answer);
    }
}
