//https://www.acmicpc.net/problem/11728

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n+m];
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
            
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++)
            arr[i+n] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        for(int x : arr)
            sb.append(x+" ");
            
        System.out.print(sb);
    }
}