//https://www.acmicpc.net/problem/14627

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int[] arrL = new int[S];
        long sum = 0;
        for(int i = 0; i < S; i++){
            arrL[i] = Integer.parseInt(br.readLine());
            sum += arrL[i];
        }
        
        Arrays.sort(arrL);
        
        long min = 1, max = arrL[S-1];
        while(min <= max){
            long mid = (min+max)/2;
            
            long cnt = 0;
            for(int i = 0; i < S; i++)
                cnt += arrL[i]/mid;
            
            if(cnt < C)
                max = mid -1;
            else
                min = mid +1;
        }
        
        System.out.print(sum - max*C);
    }
}