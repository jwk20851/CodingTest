//https://www.acmicpc.net/problem/19637

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[][] title = new String[N][2];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
            title[i][0] =  st.nextToken();
            title[i][1] =  st.nextToken();
		}
        
        StringBuilder sb = new StringBuilder();
        while(M-- > 0){
            int power = Integer.parseInt(br.readLine());
            
            int l = 0, r = N-1, idx = 0;
            while(l <= r){
                int mid = (l+r)/2;
                
                if(power <= Integer.parseInt(title[mid][1])){
                    idx = mid;
                    r = mid -1;
                }
                else
                    l = mid +1;
            }
            
            sb.append(title[idx][0]+"\n");
        }
        
        System.out.print(sb);
	}
}