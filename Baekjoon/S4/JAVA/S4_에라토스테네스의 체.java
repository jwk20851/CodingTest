//https://www.acmicpc.net/problem/2960

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        boolean[] num = new boolean[N+1];
        int idx = 0;
        for(int i = 2; i <= N; i++){
            for(int j = i; j <= N; j+=i){
                if(!num[j]){
                    num[j] = true;
                    idx++;
                }
                
                if(idx == K){
                    System.out.print(j);
                    System.exit(0);
                }
            }
        }
    }
}