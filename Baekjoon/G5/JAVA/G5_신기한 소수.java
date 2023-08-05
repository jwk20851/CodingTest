//https://www.acmicpc.net/problem/2023

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        DFS(0, N);
        
        System.out.print(sb);
	}
	
	private static void DFS(int num, int depth){
	    if(depth == 0){
	        sb.append(num).append("\n");
	        return;
	    }
	    
	    for(int i = 1; i < 10; i++){
	        int tmp = num*10 +i;
    		if(isPrime(tmp))
    			DFS(tmp, depth-1);
	    }
	}
	
	private static boolean isPrime(int num){
	    if(num < 2)
	        return false;
	        
    	for(int i = 2; i <= Math.sqrt(num); i++){
    		if(num%i == 0)
    			return false;
    	}
    	
    	return true;
	}
}
