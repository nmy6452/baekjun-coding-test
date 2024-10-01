import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        List<Robot> robots = initRobot(points, routes);

        answer += CrashCount(robots);

        do {
            //이동
            robots.forEach(Robot::move);

            //충돌여부 확인
            answer += CrashCount(robots);

            robots.removeIf(Robot::isEnd);

//             System.out.println("---------------");
//             robots.forEach(robot -> System.out.println(robot.toString()));
//             System.out.println("---------------");

            //모든 로봇이 전부 움직였다면 종료
        } while (robots.size() != 0);

        return answer;
    }

    public List<Robot> initRobot(int[][] points, int[][] routes){
        List<Robot> robots = new ArrayList<>();
        for (int[] route: routes){
            robots.add(new Robot(points,route));
        }
        return robots;
    }

    public boolean isCrash(Robot robot1, Robot robot2){
        return robot1.curPos.equals(robot2.curPos);
    }

    public int CrashCount(List<Robot> robots) {
        Set<Point> crashPoint = new HashSet<>();
        for (int i = 0; i < robots.size(); i++) {
            for (int j = i + 1; j < robots.size(); j++) {
                if (isCrash(robots.get(i), robots.get(j))) {
                    crashPoint.add(robots.get(i).curPos);
                }
            }
        }
        return crashPoint.size();
    }
}

class Robot {
    Point curPos;
    Point nextPos;

    List<Point> route = new ArrayList<>();

    public String toString(){
        return this.curPos.toString();
    }

    public boolean isEnd(){
        return curPos.equals(nextPos) && route.isEmpty();
    }

    public Robot(int[][] points, int[] routes){
        Arrays.stream(routes).forEach(route ->{
            Point newPoint = new Point(points[route-1][0],points[route-1][1]);
            this.route.add(newPoint);
        });

        this.curPos = this.route.remove(0);
        this.nextPos = this.route.remove(0);
    }

    public void move(){
        curPos.moveTo(nextPos);
        if (curPos.equals(nextPos) && !route.isEmpty()){
            nextPos = route.remove(0);
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveTo(Point point){
        if (this.x!=point.x){
            int postive = 1;
            if (this.x>point.x)
                postive = -1;
            this.x+=postive;
        }else if (this.y!=point.y){
            int postive = 1;
            if (this.y>point.y)
                postive = -1;
            this.y+=postive;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // 같은 객체인 경우
        if (obj == null || getClass() != obj.getClass()) return false;  // 다른 타입이면 false
        Point point = (Point) obj;  // 형변환
        return x == point.x && y == point.y;  // x, y 좌표가 모두 같으면 true
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);  // x와 y 값을 사용해 해시코드 생성
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("x: ");
        sb.append(this.x);
        sb.append("y: ");
        sb.append(this.y);

        return sb.toString();
    }

}