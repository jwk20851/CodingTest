//https://www.acmicpc.net/problem/6159

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
        int S = Integer.parseInt(st.nextToken());
        
        int[] cow = new int[N];
        for(int i = 0; i < N; i++)
            cow[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(cow);
        
        int l = 0, r = N-1, cnt = 0;
        while(l < r){
            int sum = cow[l]+cow[r];
            
            if(sum <= S){
                cnt += r-l;
                l++;
            }
            else
                r--;
        }
        
        System.out.print(cnt);
    }
}