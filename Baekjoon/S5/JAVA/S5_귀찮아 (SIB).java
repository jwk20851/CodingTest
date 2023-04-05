//https://www.acmicpc.net/problem/14929

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] += sum[i-1]+arr[i];
        }
        
        long total = 0;
        for(int i = 1; i <= n; i++)
            total += arr[i]*(sum[n]-sum[i]);
        
        System.out.print(total);
    }
}