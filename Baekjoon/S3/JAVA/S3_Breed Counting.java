//https://www.acmicpc.net/problem/11969

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] Holsteins = new int[N+1];
		int[] Guernseys = new int[N+1];
		int[] Jerseys = new int[N+1];
		for(int i = 1; i <= N; i++){
		    Holsteins[i] = Holsteins[i-1];
		    Guernseys[i] = Guernseys[i-1];
		    Jerseys[i] = Jerseys[i-1];
		    
		    int num = Integer.parseInt(br.readLine());
		    if(num == 1)
		        Holsteins[i]++;
		    else if(num == 2)
		        Guernseys[i]++;
		    else
		        Jerseys[i]++;
		}
		
		StringBuilder sb = new StringBuilder();
        int one = 0, two = 0, three = 0;
		for(int i = 0; i < Q; i++){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());   
		    
		    one = Holsteins[b]-Holsteins[a-1];
		    two = Guernseys[b]-Guernseys[a-1];
		    three = Jerseys[b]-Jerseys[a-1];
		    
		    sb.append(one+" "+two+" "+three+"\n");
		}
		
		System.out.print(sb);
	}
}