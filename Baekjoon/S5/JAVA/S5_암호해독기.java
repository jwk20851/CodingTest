//https://www.acmicpc.net/problem/17176

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[53];
		for(int i = 0; i < N; i++)
	        arr[Integer.parseInt(st.nextToken())]++;
		
		String str = br.readLine();
		boolean check = true;
	    for(int i = 0; i < str.length(); i++){
	        char c = str.charAt(i);
	        if(c >= 'a' && c <= 'z'){
	            if(arr[c-70] > 0)
	                arr[c-70]--;
                else{
	                check = false;
	                break;
	            }
	        }
	        else if(c >= 'A' && c <= 'Z'){
	            if(arr[c-64] > 0)
	                arr[c-64]--;
                else{
	                check = false;
	                break;
	            }
	        }
	        else{
	            if(arr[0] > 0)
	                arr[0]--;
                else{
	                check = false;
	                break;
	            }
	        }
	    }

	    System.out.print(check? "y":"n");
	}
}