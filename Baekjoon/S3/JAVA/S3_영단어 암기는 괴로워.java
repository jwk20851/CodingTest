//https://www.acmicpc.net/problem/20920

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++){
		    String str = br.readLine();
		    if(str.length() < M)
		        continue;
		        
		    hm.put(str, (!hm.containsKey(str)? 1:hm.get(str)+1));
		}
		
        List<String> li = hm.keySet().stream().collect(Collectors.toList());

        li.sort((o1, o2) -> {
            int c1 = hm.get(o1);
            int c2 = hm.get(o2);

            if(c1==c2){     //빈도수가 같을 때
                if(o1.length() == o2.length()){     //단어 길이가 같을 때
                    return o1.compareTo(o2);        //알파벳 사전 순으로 앞에 있는 단어일수록 앞에
                }
                return o2.length()-o1.length();     //단어 길이가 길수록 앞에
            }
            return c2-c1;   //빈도수가 높을수록 앞에
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < li.size(); i++)
            sb.append(li.get(i)+"\n");
        
        System.out.println(sb);
	}
}