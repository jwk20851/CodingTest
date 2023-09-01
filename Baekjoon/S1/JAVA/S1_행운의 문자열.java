//https://www.acmicpc.net/problem/1342

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static char[] alpha = new char[27];
    private static int leng, cnt = 0;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		leng = str.length();
		for(int i = 0; i < leng; i++)
            alpha[str.charAt(i) - 'a']++;
        
        DFS(0, ' ');
        
        System.out.print(cnt);
    }
    
    private static void DFS(int idx, char c){
        if(idx == leng){
            cnt++;
            return;
        }
        
        for(int i = 0; i < 27; i++){
            if(alpha[i] == 0)
                continue;
                
            if(c != (char)(i+'a')){
                alpha[i]--;
                DFS(idx+1, (char)(i+'a'));
                alpha[i]++;
            }
        }
    }
}