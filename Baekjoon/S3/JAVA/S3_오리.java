//https://www.acmicpc.net/problem/12933

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] sound = br.readLine().toCharArray();
		if(sound[0] != 'q' || sound.length%5 != 0){
		    System.out.print(-1);
		    return;
		}
		
		char[] duck = {'q','u','a','c','k'};
		int len = sound.length;
		int cnt = 0, idx = 0;
		for(int i = 0; i < len; i++){
            List<Character> li = new ArrayList<>();
			for(int j = i; j < len; j++){
				if(sound[j]!='0' && sound[j]==duck[idx]){
					li.add(sound[j]);
					sound[j] = '0';
					idx = (idx+1)%5;
				}
			}
			
			if(li.size() != 0){
				if(li.get(li.size()-1) != 'k'){
					System.out.print(-1);
					return;
				}
				cnt++;
			}
		}
		
		System.out.print(cnt);
	}
}