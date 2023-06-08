//https://www.acmicpc.net/problem/5619

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);
        
        int[] ans = new int[6];
        int idx = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(idx == 6)
                    break;
                ans[idx++] = Integer.parseInt(arr[i]+""+arr[j]);
                ans[idx++] = Integer.parseInt(arr[j]+""+arr[i]);
            }
        }
        
        Arrays.sort(ans);
        System.out.println(ans[2]);
    }
}