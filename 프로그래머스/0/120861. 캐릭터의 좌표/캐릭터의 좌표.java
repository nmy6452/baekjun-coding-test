import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        Player player = new Player(new Board(board));

        System.out.println(Arrays.toString(player.whereAmI()));

        for (int i = 0; i < keyinput.length; i++) {
            player.move(keyinput[i]);
            System.out.print(keyinput[i] + " ");
            System.out.println(Arrays.toString(player.whereAmI()));
        }

        return player.whereAmI();
    }
}


class  Board{
    int MaxX;
    int MinX;
    int MaxY;
    int MinY;

    Board(int[] board){
        MaxX = board[0]/2;
        MaxY = board[1]/2;

        MinX = -board[0]/2;
        MinY = -board[1]/2;
    }

    @Override
    public String toString() {
        return "Board{" +
                "MaxX=" + MaxX +
                ", MinX=" + MinX +
                ", MaxY=" + MaxY +
                ", MinY=" + MinY +
                '}';
    }
}

class Player{
    int posX = 0;
    int posY = 0;

    Board board;

    Player(Board board){
        System.out.println(board.toString());
        this.board = board;
    }

    int[] whereAmI(){
        return new int[]{posX,posY};
    }

    void move(String action){
        //해당 방햑으로 움직일 수 없는 경우 리턴
        if (!isMove(action))
            return;

        switch (action){
            case "up":
                posY++;
                break;
            case "down":
                posY--;
                break;
            case "left":
                posX--;
                break;
            case "right":
                posX++;
                break;

        }
    }

    boolean isMove(String action){
        switch (action){
            case "up":
                if (posY == board.MaxY)
                    return false;
                break;
            case "down":
                if (posY == board.MinY)
                    return false;
                break;
            case "left":
                if (posX == board.MinX)
                    return false;
                break;
            case "right":
                if (posX == board.MaxX)
                    return false;
                break;

        }
        return true;
    }
}