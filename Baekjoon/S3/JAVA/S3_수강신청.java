//https://www.acmicpc.net/problem/13414

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.LinkedHashSet;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		Set<String> lhs = new LinkedHashSet<>();
		for(int i = 0; i < L; i++){
		    String num = br.readLine();
		    if(lhs.contains(num))
		        lhs.remove(num);
		    lhs.add(num);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String s : lhs){
		    if(--K < 0)
		        break;
	        sb.append(s+"\n");
		}
		
		System.out.print(sb);
    }
}