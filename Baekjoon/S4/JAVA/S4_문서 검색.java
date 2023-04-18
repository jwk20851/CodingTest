//https://www.acmicpc.net/problem/1543

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		String str = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i <= text.length()-str.length(); i++){
		    if(str.equals(text.substring(i, str.length()+i))){
		        cnt++;
		        i += str.length()-1;
		    }
		}
		
		System.out.print(cnt);
	}
}