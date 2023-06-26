//https://www.acmicpc.net/problem/1251

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		List<String> li = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < str.length()-1; i++){
		    for(int j = i+1; j < str.length(); j++){
    		    StringBuilder tmp1 = new StringBuilder(str.substring(0, i)).reverse();
    		    StringBuilder tmp2 = new StringBuilder(str.substring(i, j)).reverse();
    		    StringBuilder tmp3 = new StringBuilder(str.substring(j, str.length())).reverse();

    		    sb.append(tmp1+""+tmp2+""+tmp3);
    		    li.add(sb.toString());
    		    sb.setLength(0);
		    }
		}
		
		Collections.sort(li);
		
		System.out.println(li.get(0));
	}
}
