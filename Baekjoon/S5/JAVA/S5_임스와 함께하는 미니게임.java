//https://www.acmicpc.net/problem/25757

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String kind = st.nextToken();
        
        int players = checkPlayerNum(kind);
		int cnt = 0;
		Set<String> hs = new HashSet<>();
		for(int i = 0; i < N; i++){
			String name = br.readLine();
			if(!hs.contains(name)){
				cnt++;
			    hs.add(name);
			}
		}
		
		System.out.println(cnt/players);
    }
    
    private static int checkPlayerNum(String s){
        if(s.equals("Y"))
		    return 1;
		else if(s.equals("F"))
		    return 2;
		else if(s.equals("O"))
		    return 3;
	    return 0;
    }
}