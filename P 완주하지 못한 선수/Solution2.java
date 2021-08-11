import java.util.HashMap;

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
        if (participant.length == 1) {
            return participant[0];
        }

        String answer = "";
        HashMap<String, Integer> participants = new HashMap<>(); //key는 선수 이름, value는 사람수

        for (String p : participant) participants.put(p, participants.getOrDefault(p, 0) + 1); //참여자 명단에 없으면 1, 있으면 찾은 것의 value + 1
        for (String c : completion) participants.put(c, participants.getOrDefault(c, participants.get(c)) -1); //합격자 명단에 있으면 -1, 없으면 그대로

        for (String participantName : participants.keySet()) {
            if (participants.get(participantName) != 0) { // 참여자 명단과 합격자 명단에 각각 한명씩 있었으면 0이어야 함.
                answer = participantName;
            }
        }

        return answer;
    }

}
