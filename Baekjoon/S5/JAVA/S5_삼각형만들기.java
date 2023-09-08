//https://www.acmicpc.net/problem/2622

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 0;                    //i+j > k (k가 가장 긴 변)
        for(int i = 1; i < N; i++){     
            for(int j = i; j < N; j++){
                int k = N-i-j;
                if(k < j)
                    break;
                if(k < i+j)
                    cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}