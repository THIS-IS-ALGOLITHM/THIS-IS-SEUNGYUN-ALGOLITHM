import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n1 = 3;
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println("============test1===========");
        System.out.println(Arrays.toString(solution(n1, words1)));

        int n2 = 5;
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println("============test2===========");
        System.out.println(Arrays.toString(solution(n2, words2)));

        int n3 = 2;
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println("============test3===========");
        System.out.println(Arrays.toString(solution(n3, words3)));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        List<String> w = new ArrayList<>(Arrays.asList(words));
        String before = words[0];

        for (int i = 1, order = 1; i < words.length; i++) {
            if (order < n) order++;
            else order = 1;

            if ((before.charAt(before.length() - 1) == w.get(i).charAt(0)) && w.indexOf(w.get(i)) >= i) {
                before = w.get(i);
            } else {
                answer[0] =  order;
                answer[1] = (i / n) + 1;
                break;
            }

        }

        return answer;
    }

}
