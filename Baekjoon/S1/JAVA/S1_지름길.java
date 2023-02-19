//https://www.acmicpc.net/problem/1446

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main{
    static int[] dp;
    static HashMap<Integer, List<int[]>> hm;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        dp = new int[d+1];
        
        hm = new HashMap<>();
        while(n-- > 0){
            String[] str = br.readLine().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            int dis = Integer.parseInt(str[2]);
            
            if(!hm.containsKey(end))
                hm.put(end, new ArrayList<>());
                
            hm.get(end).add(new int[]{start, dis});
        }
        
		
		System.out.println(find(d));
	}
	
	static int find(int n){
	    if(n == 0)
	        return 0;
	    
	    if(dp[n] != 0)
            return dp[n];
        
        int tmp = find(n-1) + 1;
        
        if(hm.containsKey(n)){
            for(int[] root : hm.get(n))
                tmp = Math.min(tmp, find(root[0])+root[1]);
        }
        dp[n] = tmp;
        
        return dp[n];
	}
}