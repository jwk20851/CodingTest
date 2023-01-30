//https://www.acmicpc.net/problem/3036

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n; i++){
		    int tmp = gcd(arr[0], arr[i]);
		    sb.append(arr[0]/tmp+"/"+arr[i]/tmp+"\n");
		}
		
		System.out.print(sb);
	}
	
	static int gcd(int a, int b){
	    int tmp = 0;
	    while(b != 0){
	        tmp = a%b;
	        a = b;
	        b = tmp;
	    }
	    
	    return a;
	}
}