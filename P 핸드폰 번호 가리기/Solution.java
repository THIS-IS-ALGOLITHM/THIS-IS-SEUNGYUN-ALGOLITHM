public class Solution {
    public static void main(String[] args) {
        String phoneNumber1 = "01011112222";
        System.out.println("==============test1============");
        System.out.println(solution(phoneNumber1));

        String phoneNumber2 = "021126666";
        System.out.println("==============test2============");
        System.out.println(solution(phoneNumber2));


        String phoneNumber3 = "07098563212";
        System.out.println("==============test3============");
        System.out.println(solution(phoneNumber3));

    }

    public static String solution(String phoneNumber) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < phoneNumber.length(); i++) {
            if (i >= phoneNumber.length() - 4) {
                answer.append(phoneNumber.charAt(i));
            } else {
                answer.append("*");
            }
        }

        return answer.toString();
    }
}
