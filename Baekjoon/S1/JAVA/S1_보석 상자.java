//https://www.acmicpc.net/problem/2792

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] jewel = new int[M];
        for(int i = 0; i < M; i++)
            jewel[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(jewel);
        
        int l = 1, r = jewel[M-1];
        while(l <= r){
            int mid = (l+r)/2;
            
            int cnt = 0;
            for(int i = 0; i < M; i++)
                cnt += (jewel[i]%mid==0)? jewel[i]/mid : jewel[i]/mid +1;
            
            if(cnt <= N)
                r = mid -1;
            else
                l = mid +1;
        }
        
        System.out.print(l);
    }
}