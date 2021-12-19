package 크레인인형뽑기게임;

public class Solution {
    public static void main(String[] args) {
        //test1
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}; //중간에 0이 있길래 뭐지 했는데.. [0][0]가 하나의 층이었다 !!
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int movedDollCount = 0;
        int[] movedBoard = new int[moves.length];
        int floor = board[0].length;

        for (int i = 0; i < moves.length; i++) {
            int currentFloor = moves[i] - 1;
            if (board[floor - 1][currentFloor] == 0) //만약 모두 비어있는 경우 다음 케이스로 넘어가기
                continue;
            for (int j = 0; j < floor; j++) {
                if (board[j][currentFloor] != 0) {
                    movedBoard[movedDollCount++] = board[j][currentFloor];
                    board[j][currentFloor] = 0;
                    if (movedDollCount > 1 && (movedBoard[movedDollCount - 1] == movedBoard[movedDollCount - 2])) { //이전에 들어간 인형과 현재 들어간 인형이 같으면 2개 빼기
                        movedBoard[movedDollCount] = 0;
                        movedBoard[movedDollCount - 1] = 0;
                        answer += 2;
                        movedDollCount -= 2;
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
