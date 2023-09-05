//https://www.acmicpc.net/problem/9009

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    private static List<Integer> fibo;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		createFibo();
		while(T-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    List<Integer> ans = fiboSum(n);
		    
		    for(int tmp : ans)
		        sb.append(tmp+" ");
		    sb.append("\n");
		}
		
		System.out.print(sb);
    }
    
    private static List<Integer> fiboSum(int num){
        List<Integer> li = new ArrayList<>();
        while(num > 0){
            for(int i = fibo.size()-1; i >= 0; i--){
                if(fibo.get(i) <= num){
                    num -= fibo.get(i);
                    li.add(fibo.get(i));
                }
            }
        }
        Collections.sort(li);
        li.remove(0);
        
        return li;
    }
    
    private static void createFibo(){
        fibo = new ArrayList<>();
		int idx = 2;
        fibo.add(0);
        fibo.add(1);
        while(fibo.get(idx-1) <= 1000000000){
            fibo.add(idx, fibo.get(idx-1) + fibo.get(idx-2));
            idx++;
        }
    }
}