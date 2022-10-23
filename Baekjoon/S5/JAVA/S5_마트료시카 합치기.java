//https://www.acmicpc.net/problem/25631

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
		int max = 1;
		int cnt = 1;
		for(int i = 1; i < n; i++){
			if(arr[i] == arr[i-1])
			    cnt++;
			else
			    cnt = 1;
			    
			if(cnt > max)
			    max = cnt;
		}
        
        System.out.print(max);
    }
}