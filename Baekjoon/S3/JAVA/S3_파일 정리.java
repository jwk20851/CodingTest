//https://www.acmicpc.net/problem/20291

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++){
			String[] tmp = br.readLine().split("\\.");
			map.put(tmp[1], map.getOrDefault(tmp[1], 0) + 1);
		}
		
		List<String> li = new ArrayList<>(map.keySet());
		Collections.sort(li);
        
        StringBuilder sb = new StringBuilder();
		for(String name : li)
			sb.append(name +" "+ map.get(name) +"\n");
        
		System.out.print(sb);
    }
}