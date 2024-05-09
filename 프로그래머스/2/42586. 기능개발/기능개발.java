import java.util.*;
/*
1. 각 배포일이 지날때 마다 각 작업의 진행도를 계산하고 진행도가 100%가 된 작업의 갯수를 answer에 추가

1) progress() : 하루가 지날때 마다 실행될 진행도를 변경할 함수
2) work() : 각각의 작업의 진행을 실행하는 함수
*/

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int currentVer = 0;
        ArrayList<Integer> progressesList = new ArrayList<>();
        ArrayList<Integer> speedsList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        // 배열을 ArrayList로 변환
        for (int progress : progresses) {
            progressesList.add(progress);
        }
        for (int speed : speeds) {
             speedsList.add(speed);
        }
        
        /* ----------------- 초기화 -----------------*/
        
        //현재 배포버전과 작업 전체 객수가 같아질때까지 반복실행
        while(currentVer != progressesList.size()){
            //작업진행
            progress(progressesList, speedsList);
            
            //작업 배포가능한지 확인
            int deployVer = isDeploy(currentVer, progressesList);
            // printArrayList(progressesList);
            
            if(deployVer == -1) continue;
            
            //배포된 작업 기록
            answerList.add(deployVer-currentVer);
            
            //배포진행
            currentVer = deployVer;
        }
        
        //답변 제조
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
    
    //하나의 작업 진행 후 해당 작업의 진행도 리턴
    public int work(int work, int speed){
        return (work + speed) < 100 ? work + speed : 100;
    }
    
    //하루치 업무 진행
    public void progress(ArrayList<Integer> progresses, ArrayList<Integer> speeds){
        for(int i = 0; i < progresses.size(); i++){
            int progres = work(progresses.get(i), speeds.get(i));
            progresses.set(i,progres);
        }
        
    }
    
    //배포 가능한지 확인 후 몇번째 작업까지 배포 가능한지 리턴
    //만약 배포 불가능하다면 -1 리턴
    public int isDeploy(int currentVer, ArrayList<Integer> progresses){
        for(int i =0; i < progresses.size(); i++){
            if(progresses.get(i) != 100){
                if(currentVer == i){
                    return -1;
                }
                else{
                    return i;
                }
            }
        }
        return progresses.size();
    }
    
    
    //리스트 출력
    public void printArrayList(ArrayList<Integer> List){
        System.out.print("LIST: ");
        for(Integer item : List){
            System.out.print(item + ",");
        }
        System.out.println();
    }
}