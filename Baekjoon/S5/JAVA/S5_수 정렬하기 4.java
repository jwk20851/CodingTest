//https://www.acmicpc.net/problem/11931

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Collections.reverseOrder());
		
        for(Integer i : arr)
            bw.write(i+"\n");
            
        bw.flush();
	}
}