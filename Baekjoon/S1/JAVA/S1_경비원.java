//https://www.acmicpc.net/problem/2564

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int N = Integer.parseInt(br.readLine());
        int[] store = new int[N];
        int guard = 0;
        for(int i = 0; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());
            int tmp = 0;
            switch(dir){
                case 1:
                    tmp = pos;
                    break;
                case 2:
                    tmp = 2*w + h - pos;
                    break;
                case 3:
                    tmp = 2*w + 2*h - pos;
                    break;
                case 4:
                    tmp = w + pos;
                    break;
            }
            
            if(i < N)
                store[i] = tmp;
            else
                guard = tmp;
        }
            
        int ans = 0, total = 2*w + 2*h;
        for(int dis : store){
            int tmp = Math.abs(guard - dis);
            ans += Math.min(tmp, total - tmp);
        }
        
        System.out.print(ans);
    }
}