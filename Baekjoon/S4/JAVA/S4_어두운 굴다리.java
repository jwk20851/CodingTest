//https://www.acmicpc.net/problem/17266

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] light = new int[M];
        for(int i = 0; i < M; i++)
            light[i] = Integer.parseInt(st.nextToken());
        
        int l = 1, r = N, ans = 0;
        while(l <= r){
            int mid = (l+r)/2;
            
            int before = 0;
            for(int i = 0; i < M; i++){
            	if(light[i]-mid <= before)
            		before = light[i]+mid;
            }
            
            boolean check = (before >= N)? true:false;
            if(check){
                ans = mid;
                r = mid -1;
            }
            else
                l = mid +1;
        }
      
        System.out.print(ans);
    }
}