package 신고결과받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k1 = 2;
        System.out.println(Arrays.toString(solution(id_list1, report1, k1)));

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        System.out.println(Arrays.toString(solution(id_list2, report2, k2)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> idMap = new HashMap<>();
        for (String id : id_list) {
            idMap.put(id, new ArrayList<>());
        }

        //한 유저가 여러 번 신고하면 1회로 처리
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        // 신고 횟수 세기
        for (String r : reportSet) {
            String[] reported = r.split(" ");
            idMap.get(reported[1]).add(reported[0]);
        }

        //신고 횟수가 k번 이상인지 체크 -> 메일 발송한 횟수
        int[] successReport = new int[id_list.length];

        for (String id : idMap.keySet()) {
            if (idMap.get(id).size() >= k) {
                for (int i = 0; i < idMap.get(id).size(); i ++) {
                    for (int j = 0; j < id_list.length; j ++) {
                        if (idMap.get(id).get(i).equals(id_list[j])) successReport[j]++;
                    }
                }
            }
        }

        return successReport;
    }
}
