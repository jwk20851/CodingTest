//https://www.acmicpc.net/problem/21966

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String ans = "";
		
		if(str.length() <= 25)
		    ans = str;
		else{
		    String tmp = str.substring(11, str.length()-11);
		    boolean check = true;
        	for(int i = 0; i < tmp.length()-1; i++){
        		if(tmp.charAt(i) == '.'){
        			check = false;
        			break;
        		}
        	}
        	
        	if(check)
        		ans = str.substring(0, 11)+"..."+str.substring(str.length()-11);
        	else
        		ans = str.substring(0, 9)+"......"+str.substring(str.length()-10);
		}
		
		System.out.print(ans);
	}
}