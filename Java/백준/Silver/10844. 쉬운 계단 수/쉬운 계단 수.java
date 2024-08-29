
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
       int [][] arr = new int[k+1][10];

       for(int i=0;i<10;i++){
           arr[1][i] =1;
       }
       for(int i=2;i<=k;i++){
           for(int j=0;j<10;j++){
               if(j==9){
                   arr[i][9] = arr[i-1][8];
               }
               else if(j==0){
                   arr[i][0] = arr[i-1][1];

               }
               else{
                   arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1])%1000000000;
               }
           }
       }
       int sum=0;

       for(int i=1;i<10;i++){
           sum = (sum+arr[k][i])%1000000000;
       }
        System.out.println(sum);



    }


}
