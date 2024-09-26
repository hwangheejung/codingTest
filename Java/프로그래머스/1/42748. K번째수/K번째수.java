import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];
            int k=0;
            int [] arr = new int[y-x+1];
            for(int j=x;j<=y;j++){
                 arr[k++] = array[j-1];
            }
            Arrays.sort(arr);
            answer[i] = arr[z-1];
            
     
        }
        return answer;
    }
}