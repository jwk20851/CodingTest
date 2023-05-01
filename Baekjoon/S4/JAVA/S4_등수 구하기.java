//https://www.acmicpc.net/problem/1205

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        if(N == 0){
			System.out.println(1);
			System.exit(0);
        }
        
        st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		    
		if(N==P && arr[N-1]>=score){
			System.out.println(-1);
			System.exit(0);
		}
		
		int rank = 1;
		for(int i = 0; i < N; i++){ 
			if(arr[i] > score)
				rank++;
			else
				break;
		}
	
		System.out.println(rank);
	}
}