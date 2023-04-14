//https://www.acmicpc.net/problem/2503

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N;
    private static String[] arr;
    private static int[] strike, ball;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new String[N];
		strike = new int[N];
		ball = new int[N];
		for(int i = 0; i < N; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    arr[i] = st.nextToken();
		    strike[i] = Integer.parseInt(st.nextToken());
		    ball[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){ 
                if(i == j)
                    continue;
                    
                for(int k = 1; k <= 9; k++){ 
                    if(i == k || j == k)
                        continue;
                    
                    if(check(i,j,k))
                        ans++;
                }
            }
        }
        
        System.out.print(ans);
	}
	
	public static boolean check(int a, int b, int c){
        for(int i = 0; i < N; i++){ 
            int st = 0;
            int ba = 0;
            String s = arr[i];
            
            if(s.charAt(0)-'0' == a)
                st++;
            if(s.charAt(1)-'0' == b)
                st++;
            if(s.charAt(2)-'0' == c)
                st++;
                
            if(s.charAt(0)-'0' == b || s.charAt(0)-'0' == c)
                ba++;
            if(s.charAt(1)-'0' == a || s.charAt(1)-'0' == c)
                ba++;
            if(s.charAt(2)-'0' == a || s.charAt(2)-'0' == b)
                ba++;
                
            if(strike[i] != st || ball[i] != ba)
                return false;
        }
        
        return true;
	}
}