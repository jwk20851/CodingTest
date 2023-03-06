//https://www.acmicpc.net/problem/2304

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] pillar = new int[1001];
		int start = Integer.MAX_VALUE, end = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            pillar[L] = H;
            start = Math.min(start, L);
            end = Math.max(end, L);
        }
        
        Stack<Integer> height = new Stack<Integer>();
        int tmp = pillar[start];
        for(int i = start+1; i <= end; i++){
            if(pillar[i] < tmp)
                height.push(i);
            else{
                while(!height.isEmpty()){
                    int num = height.pop();
                    pillar[num] = tmp;
                }
                tmp = pillar[i];                
            }
        }
        height.clear();
        
        tmp = pillar[end];
        for(int i = end-1; i >= start; i--){
            if(pillar[i] < tmp)
                height.push(i);
            else{
                while(!height.isEmpty()){
                    int num = height.pop();
                    pillar[num] = tmp;
                }
                tmp = pillar[i];                
            }
        }
        
        int ans = 0;
        for(int i = start; i <= end; i++)
            ans += pillar[i];
        
        System.out.print(ans);
	}
}