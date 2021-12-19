import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0 0 0")) break;

            String[] s = input.split(" ");
            LocalDate start = LocalDate.of(Integer.parseInt(s[2]), 1, 1);
            LocalDate end = LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0]));

            System.out.println(ChronoUnit.DAYS.between(start, end) + 1);
            //ChronoUnit : 객체를 생성하지 않고도 간편하게 특정 시간 단위로 시간의 길이를 구할 수 있음.
        }
    }
}