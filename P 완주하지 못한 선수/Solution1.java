public class Solution {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println("==============test1============");
        System.out.println("answer : " + solution(participant1, completion1));


        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println("==============test2============");
        System.out.println(solution(participant2, completion2));



        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println("==============test3============");
        System.out.println(solution(participant3, completion3));

        String[] participant4 = {"leo"};
        String[] completion4 = {};
        System.out.println("==============test3============");
        System.out.println(solution(participant4, completion4));

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        if (participant.length == 1) {
            return participant[0];
        }

        for (String p : participant) {
            boolean isExist = false;

            for (int j = 0; j < completion.length; j++) {
                if (completion[j].isBlank())
                    continue;
                if (p.equals(completion[j])) {
                    isExist = true;
                    completion[j] = "";
                    break;
                }
            }
            if (!isExist) {
                answer = p;
                break;
            }
        }

        return answer;
    }
}
