//https://www.acmicpc.net/problem/18113

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    private static List<Integer> li;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		li = new ArrayList<>();
		for(int i = 0; i < N; i++){
		    int tmp = Integer.parseInt(br.readLine());
		    if(tmp <= K)
		        continue;
		    
		    if(tmp < 2*K)
		        li.add(tmp-K);
		    else
		        li.add(tmp-2*K);
		}
		
		int P = -1;
		int l = 1, r = 1000000000;
		while(l <= r){
			int mid = (l+r)/2;
			
			int cnt = check(mid);
			if(cnt >= M){
				P = mid;
				l = mid +1;
			}
			else
				r = mid -1;
		}
		
		System.out.println(P);
    }
    
    static int check(int mid) {
		int sum = 0;
		for(int i : li)
			sum += i/mid;
		
		return sum;
	}
}