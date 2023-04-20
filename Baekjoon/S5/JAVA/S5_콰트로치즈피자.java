//https://www.acmicpc.net/problem/27964

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		Set<String> hs = new HashSet<>();
		for(int i = 0; i < N; i++){
		    if(str[i].length() >= 6){
		        if("Cheese".equals(str[i].substring(str[i].length()-6, str[i].length())))
		            hs.add(str[i]);
		    }
		}
		
		System.out.print((hs.size() >= 4)? "yummy":"sad");
	}
}