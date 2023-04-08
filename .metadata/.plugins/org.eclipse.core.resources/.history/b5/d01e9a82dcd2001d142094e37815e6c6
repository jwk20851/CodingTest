//https://www.acmicpc.net/problem/25192

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        HashSet<String> hs = new HashSet<String>();
        int sum = 0;
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            
            if(str.equals("ENTER")){
                sum += hs.size();
                hs.clear();
                continue;
            }
            
            hs.add(str);
        }
        sum += hs.size();
        
        System.out.print(sum);
    }
}