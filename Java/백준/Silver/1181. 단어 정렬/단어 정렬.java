

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k  = Integer.parseInt(br.readLine());

        String[] arr = new String[k];
        for(int i=0;i<k;i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() ==b.length()){
                    return a.compareTo(b);
                }
                else{
                    return a.length() -b.length();
                }

            }});

        System.out.println(arr[0]);

        for(int i=1;i<k;i++){
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }


    }
}
