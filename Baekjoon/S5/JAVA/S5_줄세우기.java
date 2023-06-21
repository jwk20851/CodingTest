//https://www.acmicpc.net/problem/10431

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(P-- > 0){
		    st = new StringTokenizer(br.readLine());
		    int idx = Integer.parseInt(st.nextToken());
		    int[] stu = new int[20];
		    for(int i = 0; i < 20; i++)
		        stu[i] = Integer.parseInt(st.nextToken());
		    
		    int ans = 0;
		    for(int i = 1; i < 20; i++){
				for(int j = 0; j < i; j++){
					if(stu[i] < stu[j])
						ans++;
				}
			}
			
			sb.append(idx+" "+ans+"\n");
		}
		System.out.print(sb);
	}
}