//https://www.acmicpc.net/problem/1312

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
        int num = A%B;
        for(int i = 0; i < N-1; i++){
            num *= 10;
            num %= B;
        }
        
        System.out.print(num*10/B);
	}
}