//https://www.acmicpc.net/problem/9613

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            
            System.out.println(gcdSum(arr, n));
        }
    }
    
    private static long gcdSum(int[] arr, int n){
        long sum = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				sum += gcd(arr[i], arr[j]);
			}
		}
		
		return sum;
    }
    
    private static int gcd(int a, int b){
		if(b == 0)
		    return a;
		return gcd(b, a%b);
	}
}