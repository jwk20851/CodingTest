//https://www.acmicpc.net/problem/1758

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int	N = Integer.parseInt(br.readLine());
	    Integer[] arr = new Integer[N]; //역순 정렬을 위해 Integer[] 선언
		for(int i = 0; i < N; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
        Arrays.sort(arr, Collections.reverseOrder());
        
		long ans = 0;
		for(int i = 0; i < N; i++)
			ans += (arr[i]-i > 0)? arr[i]-i : 0;
		
		System.out.print(ans);
    }
}