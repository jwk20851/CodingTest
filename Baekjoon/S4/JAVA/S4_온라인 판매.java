//https://www.acmicpc.net/problem/1246

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
		
		int[] arrP = new int[M];
		for(int i = 0; i < M; i++)
		    arrP[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arrP);
	    
	    long max = Integer.MIN_VALUE, ans = 0;
	    for(int i = 0; i < M; i++){
		    int price = arrP[i];
		    int extra = N;
		    long sum = 0;
		    for(int j = 0; j < M; j++){
		        if(extra > 0){
		            if(price <= arrP[j]){
		                sum += price;
		                extra--;
		            }
		        }
		        else
		            break;
		    }
		    
		    if(max < sum){
		        ans = price;
		        max = sum;
		    }
	    }
	    
	    System.out.print(ans+" "+max);
	}
}