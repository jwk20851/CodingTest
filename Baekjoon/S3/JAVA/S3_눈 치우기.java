//https://www.acmicpc.net/problem/26215

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(n-- > 0){
            int a = Integer.parseInt(st.nextToken());
            if(a > 1440){
                System.out.println(-1);
                return;
            }
            q.offer(a);
        }
        
        int cnt = 0;
        while(!q.isEmpty()){
            if(q.size() == 1){
                cnt += q.poll();
                break;
            }
            
            int fst = q.poll();
            int snd = (q.isEmpty())? 0 : q.poll();
            
            q.offer(fst-snd);
            
            cnt += snd;
        }
        
        System.out.println((cnt > 1440)? -1 : cnt);
    }
}