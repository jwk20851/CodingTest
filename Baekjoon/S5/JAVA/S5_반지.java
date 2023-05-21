//https://www.acmicpc.net/problem/5555

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(N-- > 0){
		    String ring = br.readLine();
		    if(ring.length() != 1)
		        ring += ring;
		        
		    if(ring.contains(str))
		        cnt++;
		}
		System.out.print(cnt);
	}
}