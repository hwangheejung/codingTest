
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static int k;
  static int[] visited = new int[100001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());



  if(n==k){
    System.out.println(0);
  }
  else{
    bfs(n);
  }
  }

  public static void bfs(int x){
    Queue<Integer> q = new LinkedList<>();
    q.add(x);
    visited[x] =1;

    while(!q.isEmpty()){
      int temp = q.poll();
      for(int i=0;i<3;i++){
        int next;
        if(i==0){
          next = temp+1;
        }
        else if(i==2){
          next = temp-1;
        }
        else{
          next = 2 * temp;
        }

        if(next==k){
          System.out.println(visited[temp]);
          return;
        }

        if(next>0 &&next<visited.length && visited[next] ==0){
          q.add(next);
          visited[next] = visited[temp]+1;
        }
      }

    }
  }
}
