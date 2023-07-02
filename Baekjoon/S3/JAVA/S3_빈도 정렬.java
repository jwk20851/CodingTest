//https://www.acmicpc.net/problem/2910

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(map.containsKey(tmp))
                map.put(tmp, map.get(tmp)+1);
            else
                map.put(tmp, 1);
        }

        List<Integer> li = new ArrayList<Integer>(map.keySet());    //키 리스트
        Collections.sort(li, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return map.get(b)-map.get(a);    //밸류 내림차순
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < li.size(); i++){
            for(int j = 0; j < map.get(li.get(i)); j++)
                sb.append(li.get(i)+" ");
        }
        
        System.out.print(sb);
    }
}