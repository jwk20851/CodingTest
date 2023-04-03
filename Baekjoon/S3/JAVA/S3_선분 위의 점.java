//https://www.acmicpc.net/problem/11663

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
        
        int[] point = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            point[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(point);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int l = 0, r = N-1;
            while(l <= r){
                int mid = (l+r)/2;
                
                if(point[mid] > y)
                    r = mid -1;
                else
                    l = mid +1;
            }
            
            int max = l;
            l = 0;
            r = N-1;
            while(l <= r){
                int mid = (l+r)/2;
                
                if(point[mid] < x)
                    l = mid +1;
                else
                    r = mid -1;
            }
            int min = l;
            
            sb.append(max-min+"\n");
        }
        
        System.out.print(sb);
    }
}