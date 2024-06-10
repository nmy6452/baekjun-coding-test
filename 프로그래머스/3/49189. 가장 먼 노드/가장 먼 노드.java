import java.util.*;
class Solution {
    // 인접 리스트를 사용해 그래프를 저장할 ArrayList 선언
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // 주어진 노드 개수와 간선 정보를 통해 가장 먼 노드의 개수를 찾는 함수
    public int solution(int n, int[][] edge) {
        // n개의 노드를 위해 n+1개의 빈 리스트를 생성 (1-indexed)
        for(int i = 0 ; i <= n ; i++) 
            graph.add(new ArrayList<>());
        
        // 간선 정보를 바탕으로 그래프를 구성
        for (int[] i : edge) {
            int v = i[0];
            int w = i[1];
            // 양방향 간선이므로 두 방향 모두 추가
            graph.get(v).add(w);
            graph.get(w).add(v);
        }

        // 방문 여부를 체크하기 위한 배열 초기화
        boolean[] visit = new boolean[n + 1];
        // BFS 함수를 호출하여 가장 먼 노드의 개수를 반환
        return bfs(graph, n, visit);
    }
    
    // BFS를 통해 가장 먼 노드의 개수를 찾는 함수
    public static int bfs(ArrayList<ArrayList<Integer>> graph, int n, boolean[] visit) {
        // BFS를 위한 큐 선언, 큐의 요소는 {노드 번호, 현재 깊이}
        Queue<int[]> q = new LinkedList<>();
        int answer = 0; // 가장 먼 노드의 개수를 저장할 변수
        
        // 시작 노드(1번 노드)와 깊이(0)를 큐에 추가
        q.add(new int[] {1, 0});
        visit[1] = true; // 시작 노드 방문 처리
        int maxDepth = 0; // 현재까지 탐색한 최대 깊이
        
        // 큐가 빌 때까지 BFS 수행
        while(!q.isEmpty()) {
            // 큐에서 노드를 꺼내고 현재 노드와 깊이를 얻음
            int[] arr = q.poll();
            int v = arr[0];
            int depth = arr[1];
            
            // 현재 깊이가 최대 깊이와 같으면 answer를 증가
            if(maxDepth == depth) 
                answer++; 
            // 더 깊은 노드를 찾았을 경우 answer를 1로 초기화하고 maxDepth 갱신
            else if (maxDepth < depth) { 
                maxDepth = depth;
                answer = 1;
            }

            // 현재 노드의 인접 노드를 탐색
            for (int i = 0; i < graph.get(v).size(); i++) {
                int w = graph.get(v).get(i); // 인접 정점
                // 인접 노드를 방문하지 않았다면 큐에 추가하고 방문 처리
                if (!visit[w]) {
                    q.add(new int[] { w, depth + 1 });
                    visit[w] = true;
                }
            }
        }

        // 가장 먼 노드의 개수 반환
        return answer;
    }
}