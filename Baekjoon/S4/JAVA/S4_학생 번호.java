//https://www.acmicpc.net/problem/1235

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] stuId = new String[N];
		for(int i = 0; i < N; i++)
		    stuId[i] = br.readLine();
		    
		int cnt = 1;
		while(true){
		    List<String> li = new ArrayList<String>();
            for(int i = 0; i < N; i++){
                String tmp = stuId[i].substring(stuId[i].length()-cnt, stuId[i].length());
                if(!li.contains(tmp))
                    li.add(tmp);
                else
                    break;
            }
            
            if(li.size() == N)
                break;
            
            cnt++;
		}
		
        System.out.print(cnt);
	}
}