//https://www.acmicpc.net/problem/1059

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] S = new int[L];
		for(int i = 0; i < L; i++)
            S[i] = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        
        Arrays.sort(S);
        
        int l = 0, r = 0;
		for(int i = 0; i < L; i++){
            if(S[i] >= n){
                if(i != 0)
                    l = S[i-1];
                r = S[i];
                break;
            }
        }
        
        int cnt = 0;
        for(int i = l+1; i <= n; i++){
            for(int j = n; j < r; j++){
                if(i == j)
                    continue;
                else
                    cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}