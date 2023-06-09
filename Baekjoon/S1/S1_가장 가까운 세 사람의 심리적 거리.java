//https://www.acmicpc.net/problem/20529

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            String[] mbti = br.readLine().split(" ");
            
            if(N > 32){
                System.out.println(0);
                continue;
            }
            System.out.println(selectMBTI(mbti, N));
        }
    }
    
    private static int selectMBTI(String[] mbti, int n){
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    ans = Math.min(ans, checkDis(mbti[i], mbti[j], mbti[k]));
                }
            }
        }
        
        return ans;
    }
    
    private static int checkDis(String a, String b, String c){
        int dis = 0;
        for(int i = 0; i < 4; i++){
            if(a.charAt(i) != b.charAt(i))
                dis++;
            if(b.charAt(i) != c.charAt(i))
                dis++;
            if(c.charAt(i) != a.charAt(i))
                dis++;
        }
        
        return dis;
    }
}