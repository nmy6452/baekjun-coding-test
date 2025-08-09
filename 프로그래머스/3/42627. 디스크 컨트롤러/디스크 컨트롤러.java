import java.util.*;

class Solution {
        int endJob = 0;
        int workTime = 0;
        WorkQueue queue = new WorkQueue();
    
        int curTime = 0;
        int preTime = -1;
    
    public int solution(int[][] jobs) {
        
        while(true){
            // 만약 마친 일이 모든 일의 숫자와 같이지면 모든 작업 종료
            if(endJob == jobs.length){
                break;
            }
            
            // 현제 큐에 적재할 작업 적재
            for(int i = 0; i<jobs.length; i++){
                if(jobs[i][0] <= curTime && jobs[i][0] > preTime){
                    queue.workList.add(new Work(jobs[i][0], jobs[i][1]));   
                }
            }
            
            if(queue.workList.size() <= 0){
                curTime++;
                continue;
            }
            
            //작업진행
            Work curWork = queue.getNextWork();
            preTime = curTime;
            curTime += curWork.l;
            
            workTime += curTime-curWork.s;
            endJob++;
        }
        
        return workTime/endJob;
    }
    
    class WorkQueue{
        public List<Work> workList = new LinkedList<>();
        
        public void add(Work w){
            this.workList.add(w);
        }
        
        public Work getNextWork(){
            // 작업할 업무가 없다면 null 반환
            if(this.workList.size() <= 0) return null;
            
            // 소요시간이 짧은 것, 작업의 요청 시각이 빠른 것, 작업의 번호가 작은 것
            int index = 0;
            
            for(int i = 1; i < this.workList.size(); i++){
                if(this.workList.get(i).l < this.workList.get(index).l){
                    index = i;
                }
                else if(this.workList.get(i).l == this.workList.get(index).l){
                    if(this.workList.get(i).s < this.workList.get(index).s){
                        index = i;
                    }
                }
            }
            
            return this.workList.remove(index);
            
        }
    }
    
    class Work{
        // 작업이 요청되는 시점이며 0 ≤ s ≤ 1,000입니다
        public int s;
        // 작업의 소요시간이며 1 ≤ l ≤ 1,000입니다.
        public int l;
        
        public Work(int s, int l){
            this.s  = s;
            this.l  = l;
        }
        
    }
}