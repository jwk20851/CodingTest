//https://www.acmicpc.net/problem/16208

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long stick = 0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            stick += arr[i];
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            stick -= arr[i];
            ans += stick*arr[i];
        }
        
        System.out.println(ans);
    }
}