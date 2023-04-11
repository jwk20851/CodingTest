//https://www.acmicpc.net/problem/1343

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String tmp = str.replaceAll("XXXX", "AAAA");
        String ans = tmp.replaceAll("XX", "BB");
		
		System.out.print(ans.contains("X")? -1 : ans);
	}
}