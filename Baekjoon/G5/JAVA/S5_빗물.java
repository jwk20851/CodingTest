//https://www.acmicpc.net/problem/14719

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] block = new int[W];
        for(int i = 0; i < W; i++)
            block[i] = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        for(int i = 1; i <= W-2; i++){
            int l = 0, r = 0;
            for(int j = 0; j < i; j++)
                l = Math.max(l, block[j]);
            for(int j = W-1; j > i; j--)
                r = Math.max(r, block[j]);
            
            int tmp = Math.min(l,r)-block[i];
            sum += (tmp>0)? tmp : 0;
        }
        
        System.out.print(sum);
    }
}