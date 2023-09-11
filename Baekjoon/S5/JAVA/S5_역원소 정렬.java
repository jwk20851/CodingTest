//https://www.acmicpc.net/problem/5648

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(idx < n){
            if(st.hasMoreTokens()){
                String str = sb.append(st.nextToken()).reverse().toString();
                arr[idx] = Long.parseLong(str);
                sb.setLength(0);
                idx++;
            }
            else
                st = new StringTokenizer(br.readLine());
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++)
            sb.append(arr[i]).append("\n");
        
        System.out.print(sb);
    }
}