package 폰켓몬;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }

    public static int solution(int[] nums) {
        int max = nums.length/2;
        List<Integer> deduplicationNums = new ArrayList<>();

        for (int i : nums) {
            if (!deduplicationNums.contains(i)) {
                deduplicationNums.add(i);
            }
            if (deduplicationNums.size() == max) {
                return max;
            }
        }

        return deduplicationNums.size();
    }
    
    //중복을 제거해서 저장하는 set을 쓰는 방법도 있었다..

}
