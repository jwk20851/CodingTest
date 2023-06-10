//https://www.acmicpc.net/problem/14713

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Queue[] q = new Queue[N];
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            q[i] = new LinkedList<String>();
			
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens())
				q[i].add(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        boolean ansCheck = false;
		while(st.hasMoreTokens()){
			String tmp = st.nextToken();
			boolean senCheck = false;
			for(int i = 0; i < N;i++){
				if(!q[i].isEmpty()){
    				if(q[i].peek().equals(tmp)){
    					q[i].poll();
    					senCheck = true;
    					break;
    				}
				}
			}
			
			if(!senCheck){
				ansCheck = true;
				break;
			}	
		}
		
		for(int i = 0; i < N; i++){
			if(!q[i].isEmpty())
				ansCheck = true;
		}
		
		System.out.println((!ansCheck)? "Possible":"Impossible");
    }
}