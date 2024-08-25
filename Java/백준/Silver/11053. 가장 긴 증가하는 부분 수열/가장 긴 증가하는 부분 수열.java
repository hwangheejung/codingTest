
import java.io.*;
import java.util.*;


public class Main {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    int [] arr = new int[k+1];
    for(int i=1;i<=k;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
  int sum = 0;
    int dp[] = new int[k+1];
    for(int i=1;i<=k;i++){
      dp[i] = 1;
      for(int j = i-1;j>=1;j--){
          if(arr[i]>arr[j]){
            dp[i]  = Math.max(dp[i],dp[j]+1);
          }
      }
      sum = Math.max(dp[i],sum);
    }
    System.out.println(sum);


  }
}
