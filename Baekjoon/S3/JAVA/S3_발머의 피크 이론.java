//https://www.acmicpc.net/problem/27496

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int cnt = 0, sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
            
            if(i >= L)
                sum -= arr[i-L];
                
            if(sum >= 129 && sum <= 138)
                cnt++;
        }
        
        System.out.print(cnt);
    }
}