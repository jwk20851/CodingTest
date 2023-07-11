//https://www.acmicpc.net/problem/4358

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Integer> hm = new HashMap<>();
		double total = 0;
		String str = "";
        while((str = br.readLine()) != null){
            //map.get(k): k(Key)�� �������� ���� ��� null ��ȯ
            //map.getOrDefault(k, v): k(Key)�� ������ ��� ���ε� ���� ��ȯ, ���� ��� v(defaultValue) ��ȯ
            hm.put(str, hm.getOrDefault(str,0) +1);
            total++;
        }
        
        List<String> li = new ArrayList<>(hm.keySet());
        Collections.sort(li);
        
        StringBuilder sb = new StringBuilder();
        for(String tmp : li)
            sb.append(tmp +" "+ String.format("%.4f", hm.get(tmp)/total*100) +"\n");
        
        System.out.print(sb);
    }
}