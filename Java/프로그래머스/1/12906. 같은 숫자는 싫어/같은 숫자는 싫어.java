import java.util.*;
import java.io.*;
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
            }
            else{
            if(stk.peek() != arr[i]){
            stk.push(arr[i]);
            }
            }
        }
        answer = new int[stk.size()];
       for(int i=stk.size()-1;i>=0;i--){
           answer[i] = stk.pop();
       }
        return answer;
    }
}