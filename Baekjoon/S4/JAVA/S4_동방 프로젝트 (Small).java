//https://www.acmicpc.net/problem/14594

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        int[] rooms = new int[N+1];
        StringTokenizer st;
        while(M-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int i = a; i < b; i++)
                rooms[i] = -1;
        }
        
        int cnt = 0;
        for(int i = 1; i <= N; i++){
            if(rooms[i] == 0)
                cnt++;
        }
        
        System.out.print(cnt);
    }
}