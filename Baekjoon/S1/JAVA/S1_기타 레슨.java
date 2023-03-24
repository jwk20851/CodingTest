//https://www.acmicpc.net/problem/2343

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static char[] arr;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] dvd = new int[N];
        int start = 0, end = 0;
        for(int i = 0; i < N; i++){
            dvd[i] =  Integer.parseInt(st.nextToken());
            start = Math.max(start, dvd[i]);
            end += dvd[i];
        }
        
        while(start<=end){
            int mid = (start+end)/2;
            int sum = 0, cnt = 0;
            for(int i = 0; i < N; i++){
                if(sum+dvd[i] > mid){
					cnt++;
					sum =0;
				}
                sum += dvd[i];
            }
            if(sum != 0)
                cnt++;
                
			if(cnt <= M)
			    end = mid -1;
			else
			    start = mid +1;
        }
        
        System.out.print(start);
	}
}