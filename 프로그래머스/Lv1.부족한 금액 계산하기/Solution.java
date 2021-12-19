import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int money = scanner.nextInt();
        int count = scanner.nextInt();
        System.out.println(solution(price, money, count));
    }

    public static long solution(int price, int money, int count) {
        long totalCost = 0;
        for (int i = 1; i <= count; i++) {
            totalCost += price * i;
        }
        if (money - totalCost < 0) {
            return totalCost - money;
        } else {
            return 0;
        }
    }

}
