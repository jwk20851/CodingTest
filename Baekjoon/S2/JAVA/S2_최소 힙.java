//https://www.acmicpc.net/problem/1927

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(x != 0)
                q.offer(x);
            else{
                if(q.isEmpty())
                    sb.append(0+"\n");
                else
                    sb.append(q.poll()+"\n");
            }
        }
        
        System.out.print(sb);
    }
}