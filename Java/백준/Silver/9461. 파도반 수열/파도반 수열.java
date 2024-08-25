import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    int arr[] = new int[T];
    for(int i=0;i<T;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    List<Long> list = new ArrayList<>();

    list.add(1L);
    list.add(1L);
    list.add(1L);
    for(int i=0;i<T;i++){
      for(int j = list.size();j<arr[i];j++){
        list.add(list.get(j-3) +list.get(j-2));
      }
      System.out.println(list.get(arr[i]-1));
    }

  }
}
