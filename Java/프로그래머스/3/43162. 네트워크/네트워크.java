import java.util.*;
import java.io.*;

class Solution {

    public int solution(int n, int[][] computers) {
        int answer=0;
        boolean[] visited =new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
            bfs(computers,visited,i);
            answer++;
            }
        }
      
        return answer;
    }
    
    static void bfs(int[][] computers , boolean[] visited , int v){
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);
        
        while(!q.isEmpty()){
            int w = q.poll();
            for(int i=0;i<computers.length;i++){
                if(computers[w][i]==1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        
    }
}