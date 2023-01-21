//https://www.acmicpc.net/problem/2628

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> rowLine = new ArrayList<Integer>();
		List<Integer> colLine = new ArrayList<Integer>();
		
		rowLine.add(Integer.parseInt(st.nextToken()));
		colLine.add(Integer.parseInt(st.nextToken()));
		rowLine.add(0);
		colLine.add(0);
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++){
		    st = new StringTokenizer(br.readLine());
		    int tmp = Integer.parseInt(st.nextToken());
		    int target = Integer.parseInt(st.nextToken());
		    
		    if(tmp == 0)
		        colLine.add(target);
		    else
		        rowLine.add(target);
		}
		
		Collections.sort(rowLine);
		Collections.sort(colLine);
		
		int w = 0, h = 0, max = 0;
		for(int i = 1; i < rowLine.size(); i++){
			for(int j = 1; j < colLine.size(); j++){
				w = rowLine.get(i) - rowLine.get(i - 1);
				h = colLine.get(j) - colLine.get(j - 1);
				max = Math.max(max, w*h);
			}
		}
		
		System.out.println(max);
	}
}