import java.util.*;
import java.io.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map <String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0;i<clothes.length;i++){
            if(map.containsKey(clothes[i][1])){
                int size = (int) map.get(clothes[i][1]) +1;
                map.put (clothes[i][1], size);
            }
            else{
                map.put(clothes[i][1],1);
            }
            
        }

         for (Map.Entry<String, Integer> entry : map.entrySet()) {
            answer = answer * (entry.getValue() + 1);
        }
        answer -= 1;
    
       
        
        
        return answer;
    }
}