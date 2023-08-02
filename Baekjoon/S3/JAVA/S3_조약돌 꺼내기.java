//https://www.acmicpc.net/problem/13251

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int[] stone = new int[M];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalStone = 0;
        for(int i = 0; i < M; i++){
            stone[i] = Integer.parseInt(st.nextToken());
            totalStone += stone[i];
        }
        
        int K = Integer.parseInt(br.readLine());
        double totalCase = 1;
	    for(int i = 0; i < K; i++)
	        totalCase *= totalStone - i;
	    
	    double caseSum = 0;
	    for(int i = 0; i < M; i++){
	        if(stone[i] >= K){
    	        double eachCase = 1;
    	        for(int j = 0; j < K; j++)
    	            eachCase *= stone[i] - j;
    	        
    	        caseSum += eachCase;
            }
	    }
        
        System.out.print(caseSum/totalCase);
    }
}