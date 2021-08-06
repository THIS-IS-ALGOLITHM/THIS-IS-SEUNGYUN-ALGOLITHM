import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String diarySentence = scanner.nextLine();
        List<String> originalSentence = new ArrayList<>();
        for (int i = 0; i < diarySentence.length(); i++) {
            Character c = diarySentence.charAt(i);
            originalSentence.add(c.toString());
            if (c == 'a' || c  == 'e' || c == 'i' || c == 'o' || c == 'u') {
                i += 2;
            }
        }

        originalSentence.forEach(System.out::print);

    }
}
