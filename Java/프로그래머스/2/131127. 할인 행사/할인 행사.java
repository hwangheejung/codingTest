import java.util.*;
import java.io.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> thing = new HashMap<String,Integer>();
        for(int i=0;i<want.length;i++){
            thing.put(want[i],number[i]);
        }
        for(int i=0;i<=discount.length-10;i++){
             Map<String,Integer> check = new HashMap<String,Integer>();
            for(int j=i;j<10+i;j++){
                if(check.containsKey(discount[j])){
                    int size = (int) check.get(discount[j])+1;
                check.put(discount[j],size);
                }
                else{
                    check.put(discount[j],1);
                }
            }
            Boolean isIdentical =true;
             for(String key : thing.keySet()){
                if(thing.get(key) != check.get(key)){
                    isIdentical = false;
                    break;
                }
            }

            answer += isIdentical? 1 :0;
        }
       
        return answer;
    }
}