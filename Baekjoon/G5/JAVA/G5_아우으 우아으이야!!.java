//https://www.acmicpc.net/problem/15922

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int before = Integer.MIN_VALUE, total = 0, length = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(before >= b)
                continue;
            
            if(before <= a)
                length = b-a;
            else
                length = b-before;
            
            before = b;
            total += length;
        }
        
        System.out.print(total);
    }
}