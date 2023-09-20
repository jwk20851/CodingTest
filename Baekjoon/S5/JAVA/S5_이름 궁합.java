//https://www.acmicpc.net/problem/15312

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		int[] alpha = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		int[] arr = new int[A.length() + B.length()];
        for(int i = 0; i < arr.length-1; i += 2){
        	arr[i] = alpha[A.charAt(i/2) - 65];
            arr[i+1] = alpha[B.charAt(i/2) - 65];
        }
        
        int size = arr.length;
        while(size > 2){
            for(int i = 0; i < size-1; i++)
            	arr[i] = (arr[i]+arr[i+1])%10;
            arr[--size] = 0;
        }
 
        System.out.print(arr[0]+""+arr[1]);
    }
}