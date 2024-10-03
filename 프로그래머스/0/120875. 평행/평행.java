import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

class Solution {
    public static void main(String[] args) {
        int[][] aa = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(solution(aa));
    }
    
    public static int solution(int[][] dots) {
        int answer = 0;
        Pos[] pos = new Pos[dots.length];
        List<Line> line = new ArrayList<>();

        //점 생성
        for (int i = 0; i < dots.length; i++) {
            pos[i] = new Pos(dots[i]);
        }

        //점으로 만들 수 있는 모든 선을 생성
        for (int i = 0; i < pos.length-1; i++) {
            for (int j = i+1; j < pos.length; j++) {
                line.add(new Line(pos[i], pos[j]));
            }
        }

        //모든 선을 두개씩 비교해서 평행인지 확인
        for (int i = 0; i < line.size()-1; i++) {
            for (int j = i+1; j < line.size(); j++) {
                if(line.get(i).isParallel(line.get(j))){
                    if (line.get(i).hasSamePos(line.get(j)))
                        continue;
                    return 1;
                }
            }
        }

        return 0;
    }
}

class Pos {
    int x;
    int y;

    Pos(int[] array){
        this.x = array[0];
        this.y = array[1];
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pos))
            return false;

        Pos newPos = (Pos)obj;
        return newPos.x == this.x && newPos.y == this.y;
    }
}

class Line{
    Pos pos1;
    Pos pos2;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line))
            return false;

        Line newLine = (Line)obj;
        return newLine.pos1.equals(this.pos1) && newLine.pos2.equals(this.pos2);
    }

    boolean hasSamePos(Line line){
        if (line.pos1.equals(this.pos1))
            return true;
        if (line.pos1.equals(this.pos2))
            return true;
        if (line.pos2.equals(this.pos1))
            return true;
        if (line.pos2.equals(this.pos2))
            return true;

        return false;
    }


    Line(Pos pos1, Pos pos2){
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    boolean isParallel(Line line){
        //평행 여부 확인
        return this.getInclination() == line.getInclination();
    }

    float getInclination(){
        if ((pos1.x - pos2.x) == 0 || (pos1.y- pos2.y) == 0)
            return 0;
        float inclination = (float)(pos1.x - pos2.x) / (float)(pos1.y- pos2.y);
        return inclination;
    }
}