import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0 0 0")) break;
            String[] s = input.split(" ");

            int count = 0;
            int year = Integer.parseInt(s[2]);
            int month = Integer.parseInt(s[1]);
            int day = Integer.parseInt(s[0]);

            if (month >= 12) count += 30;
            if (month >= 11) count += 31;
            if (month >= 10) count += 30;
            if (month >= 9) count += 31;
            if (month >= 8) count += 31;
            if (month >= 7) count += 30;
            if (month >= 6) count += 31;
            if (month >= 5) count += 30;
            if (month >= 4) count += 31;
            if (month >= 3) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    count++;
                }
                count += 28;
            }
            if (month >= 2) count += 31;
            if (month >= 1) count += day;

            System.out.println(count);
        }
    }
}