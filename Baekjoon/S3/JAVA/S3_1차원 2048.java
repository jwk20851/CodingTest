//https://www.acmicpc.net/problem/27514

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i = 0; i < n; i++){
            long tmp = Long.parseLong(st.nextToken());
            if(tmp != 0)
                pq.add(tmp);
        }
        
        long before = 0;
        while(!pq.isEmpty()) {
            if(before == 0){
                before = pq.poll();
                continue;
            }
            
            long now = pq.poll();
            
            if(before < now)
                before = now;
            else if(before == now){
                pq.add(before*2);
                before = 0;
            }
        }
        
        System.out.println(before);
    }
}