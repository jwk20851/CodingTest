//https://www.acmicpc.net/problem/25379

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken())%2;
            
        long l = 0, r = 0, sum = 0, idx = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] == 0){
                sum += idx++;
                l += i;
                r += N-i-1;
            }
        }
        
        System.out.print(Math.min(l,r) - sum);
	}
}