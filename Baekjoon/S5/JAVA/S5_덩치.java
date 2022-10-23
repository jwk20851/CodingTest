//https://www.acmicpc.net/problem/7568

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] xy = new int[n][2];
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            xy[i][0] = Integer.parseInt(str[0]);
            xy[i][1] = Integer.parseInt(str[1]);
            ans[i] = 1;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    if(xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1])
                        ans[i]++;
                }
            }
            sb.append(ans[i]+"\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}