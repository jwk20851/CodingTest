//https://www.acmicpc.net/problem/17164

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String jewel = br.readLine();
        
        char before = jewel.charAt(0);
        int cnt = 1, max = 0;
        for(int i = 1; i < N; i++){
            char now = jewel.charAt(i);
            
            if((now=='R' && before=='B') || (now=='B' && before=='R'))
                cnt++;
            else{
                max = Math.max(max, cnt);
                cnt = 1;
            }
            
            before = jewel.charAt(i);
        }
        max = Math.max(max, cnt);
        
        System.out.print(max);
    }
}