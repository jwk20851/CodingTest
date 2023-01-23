//https://www.acmicpc.net/problem/7785

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<String, String> hm = new HashMap<String, String>();
		for(int i = 0; i < n; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    String name = st.nextToken();
		    String tmp = st.nextToken();
		    
		    if(tmp.equals("enter"))
		        hm.put(name, tmp);
		    else
		        hm.remove(name);
		}
		
		List<String> li = new ArrayList<String>(hm.keySet());
		Collections.sort(li);
		
		StringBuilder sb = new StringBuilder();
		for(int i = li.size()-1; i >= 0; i--)
		    sb.append(li.get(i)+"\n");
		
		System.out.print(sb);
	}
}