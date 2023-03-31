//https://www.acmicpc.net/problem/15810

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
        
        st = new StringTokenizer(br.readLine());
        long[] staff = new long[N];
        for(int i = 0; i < N; i++)
            staff[i] = Long.parseLong(st.nextToken());
        
        Arrays.sort(staff);
        
        long l = 0, r = staff[0]*M;
        while(l <= r){
            long mid = (l+r)/2;
            
            long cnt = 0;
            for(int i = 0; i < N; i++)
                cnt += mid/staff[i];
            
            if(cnt < M)
                l = mid +1;
            else
                r = mid -1;
        }
        
        System.out.print(l);
    }
}