//https://www.acmicpc.net/problem/14246

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
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        int k = Integer.parseInt(br.readLine());
        int l = 0, r = 0;
        long cnt = 0;
        while(l < n){
            long sum = 0;
            
            r = l;
            while(r < n){
                sum += arr[r];
                
                if(sum > k){
                    cnt += n-r;
                    break;
                }
                else
                    r++;
            }
            
            l++;
        }
        
        System.out.print(cnt);
    }
}