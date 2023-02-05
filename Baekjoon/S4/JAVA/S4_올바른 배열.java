//https://www.acmicpc.net/problem/1337

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> li = new ArrayList<>();
		for(int i = 0; i < n; i++)
		    li.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(li);
		
		int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= 4; j++){
                if(!li.contains(li.get(i)+j))
                    arr[i]++;
            }
        }
		
		int min = arr[0];
		for(int v : arr)
		    min = Math.min(v, min);
		
		System.out.print(min);
	}
}