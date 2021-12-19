package 숫자문자열과영단어;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
        System.out.println(solution("zero"));
        System.out.println(solution("onezeroone"));
    }

    public static int solution(String s) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++) {
            s = s.replaceAll(number[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
