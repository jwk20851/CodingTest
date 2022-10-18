//https://www.acmicpc.net/problem/1316

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int n = Integer.parseInt(br.readLine());
	    StringBuilder[] sb = new StringBuilder[201];
	    
	    for(int i = 1; i <= 200; i++)
	        sb[i] = new StringBuilder();
	        
	    while(n-- > 0){
	        String str = br.readLine();
			StringTokenizer st =new StringTokenizer(str);
			int age = Integer.parseInt(st.nextToken());
			
			sb[age].append(str).append("\n");
	    }
	    
		for(StringBuilder ans : sb){
		    if(ans != null)
                bw.write(ans.toString());
		}
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
}
