//https://www.acmicpc.net/problem/11866

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 1; i <= n; i++)
            q.add(i);
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(q.size() > 0){
            for(int i = 0; i < k-1; i++)
                q.add(q.poll());
                
            sb.append(q.poll());
            sb.append((q.size() > 0)? ", ":">");
        }
        
        System.out.print(sb);
        br.close();
    }
}