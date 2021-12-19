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
        s = s.replaceAll("zero", "0");
        s = s.replaceAll("one","1");
        s = s.replaceAll("two","2");
        s = s.replaceAll("three","3");
        s = s.replaceAll("four","4");
        s = s.replaceAll("five","5");
        s = s.replaceAll("six","6");
        s = s.replaceAll("seven","7");
        s = s.replaceAll("eight","8");
        s = s.replaceAll("nine","9");


        return Integer.parseInt(s);
    }
}
