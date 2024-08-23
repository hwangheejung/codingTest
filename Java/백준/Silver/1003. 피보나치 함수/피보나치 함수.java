import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


public class Main {

    static int[] arr;//arr생성

    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        arr = new int[t];
        for(int i=0;i<t;i++){
            arr[i] = Integer.parseInt((br.readLine()));
        }

       List<Pair> result = new ArrayList<>();
        result.add(new Pair(1,0));
        result.add(new Pair(0,1));

        for(int i=0;i<t;i++){
            if(arr[i]>result.size()-1){
                for(int j =result.size();j<=arr[i];j++){

                    result.add(new Pair(result.get(j-1).x+result.get(j-2).x, result.get(j-1).y+result.get(j-2).y));

                }
            }
           sb.append(result.get(arr[i]).x +" "+ result.get(arr[i]).y +"\n");

        }
        System.out.println(sb);

    }
}
