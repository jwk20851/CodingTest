//https://www.acmicpc.net/problem/23757

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
            q.offer(Integer.parseInt(arr[i]));
        
        arr = br.readLine().split(" ");
        int ans = 1;
        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(arr[i]);
            
            if(q.peek() >= num){
			    q.offer(q.peek()-num);
			    q.poll();
    		}
    		else{
    		    ans = 0;
    		    break;
    		}
        }
        
        System.out.println(ans);
    }
}