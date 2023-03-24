//https://www.acmicpc.net/problem/4779

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    private static char[] arr;
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str;
        while((str=br.readLine()) != null){
            int N = Integer.parseInt(str);
            int cnt = (int)Math.pow(3,N);
            
            arr = new char[cnt];
		    Arrays.fill(arr, '-');
            
            Func(0, cnt);
            
            for(char c : arr)
                sb.append(c);
            sb.append("\n");
        }
        
        System.out.print(sb);
	}
	
	private static void Func(int idx, int cnt){
	    if(cnt == 1)
	        return;
	    
	    int front = cnt/3;
	    int back = cnt/3*2;
	    for(int i = idx+front; i < idx+back; i++)
	        arr[i] = ' ';
	        
	    Func(idx, front);
	    Func(idx+back, front);
	}
}