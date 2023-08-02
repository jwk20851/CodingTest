//https://www.acmicpc.net/problem/17087

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] pos = new int[N];
        for(int i = 0; i < N; i++){
            pos[i] = Math.abs(S-Integer.parseInt(st.nextToken()));
        }
        
        int gcd = pos[0];
		for(int i = 1; i < N; i++)
			gcd = GCD(gcd,pos[i]);
		
		System.out.println(gcd);
    }
    
    public static int GCD(int a, int b){
		if(b == 0)
		    return a;
		return GCD(b, a%b);
	}
}