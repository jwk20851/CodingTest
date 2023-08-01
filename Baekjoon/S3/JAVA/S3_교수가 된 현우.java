//https://www.acmicpc.net/problem/3474

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            
            long cnt = 0;
            for(int j = 5; j <= N; j*=5)	//5의 개수 구하기
                cnt += N/j;

            sb.append(cnt).append("\n");
        }
        
        System.out.print(sb);
    }
}