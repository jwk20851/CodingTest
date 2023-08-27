//https://www.acmicpc.net/problem/2980

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int time = 0, pos = 0;
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    int D = Integer.parseInt(st.nextToken());
    		int R = Integer.parseInt(st.nextToken());
    		int G = Integer.parseInt(st.nextToken());
    		
    		time += D-pos;
    		pos = D;
    		
    		int tmp = time%(R+G);
    		if(tmp <= R)
    		    time += R-tmp;
		}
		time += L-pos;
		
		System.out.print(time);
    }
}