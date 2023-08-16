//https://www.acmicpc.net/problem/2002

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++)
            map.put(br.readLine(), i);
        
        int[] car = new int[N];
        for(int i = 0; i < N; i++){
            String tmp = br.readLine();
            car[i] = map.get(tmp);
        }
        
        int ans = 0;
        for(int i = 0; i< N-1; i++){
            for(int j = i+1; j< N; j++){
                if(car[i] > car[j]){
                    ans++;
                    break;
                }
            }
        }
        
        System.out.print(ans);
    }
}