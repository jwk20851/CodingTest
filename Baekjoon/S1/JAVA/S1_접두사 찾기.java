//https://www.acmicpc.net/problem/14426

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String>[] hs = new HashSet[501];
        for(int i = 1; i <= 500; i++)
            hs[i] = new HashSet<>();
        
        while(N-- > 0){
            String str = br.readLine();
            String tmp = "";
            for(int i = 0; i < str.length(); i++){
                tmp += str.charAt(i);
                hs[tmp.length()].add(tmp);
            }
        }
        
        int cnt = 0;
        while(M-- > 0){
            String cur = br.readLine();
            if(hs[cur.length()].contains(cur))
                cnt++;
        }
        
        System.out.println(cnt);
    }
}