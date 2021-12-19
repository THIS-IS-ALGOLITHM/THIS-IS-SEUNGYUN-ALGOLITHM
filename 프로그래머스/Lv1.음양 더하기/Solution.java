package 음양더하기;

public class Solution {
    public static void main(String[] args) {
        //test1
        int[] absolutes1 = {4,7,12};
        boolean[] signs1 = {true,false,true};
        System.out.println(solution(absolutes1, signs1));

        //test2
        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};
        System.out.println(solution(absolutes2, signs2))    ;
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }
}
