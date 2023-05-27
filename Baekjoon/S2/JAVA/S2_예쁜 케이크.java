//https://www.acmicpc.net/problem/24040

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
		    long N = Long.parseLong(br.readLine());
		    /*
		    (w+h)%3 == 0, wh = N;
		    w%3 = 1, h%3 = 2 || w%3 = 2, h%3 = 1 || w%3 = 0, h%3 = 0
		        => wh%3 = 2, wh%9 = 0;
		    */
		    System.out.println((N%3==2 || N%9==0)? "TAK":"NIE");
		}
	}
}