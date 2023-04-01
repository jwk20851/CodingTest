//https://www.acmicpc.net/problem/16564

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] lv = new int[N];
        long min = Integer.MAX_VALUE, max = 2000000000;
        for(int i = 0; i < N; i++){
            lv[i] = Integer.parseInt(br.readLine());
            min = Math.min(min, lv[i]);
        }
        
        while(min <= max){
            long mid = (min+max)/2;
            
            long sum = 0;
            for(int i = 0; i < N; i++){
                if(lv[i] < mid)
                    sum += mid-lv[i];
            }
            
            if(sum <= K)
                min = mid +1;
            else
                max = mid -1;
        }
        
        System.out.print(max);
    }
}