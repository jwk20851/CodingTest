//https://www.acmicpc.net/problem/19941

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        String str = br.readLine();
        char[] table = new char[str.length()];
        for(int i = 0; i < str.length(); i++)
            table[i] = str.charAt(i);
        
        int l = 0, r = 0, cnt = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] == 'P'){
                l = Math.max(i-K, 0);
                r = Math.min(i+K+1, table.length);
                for(int j = l; j < r; j++){
                    if(table[j] =='H'){
                        cnt++;
                        table[j] = 'X';
                        break;
                    }
                }
            }
        }
        
        System.out.print(cnt);
	}
}