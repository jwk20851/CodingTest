//https://www.acmicpc.net/problem/1181

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    String[] arr = new String[n];
	    
	    for(int i = 0; i < n; i++)
	        arr[i] = br.readLine();
	        
	    Arrays.sort(arr, new Comparator<String>(){
	        @Override
	        public int compare(String s1, String s2){
	            if(s1.length() == s2.length())
	                return s1.compareTo(s2);
	            else
	                return s1.length() - s2.length();
	        }
	    });
	    
	    StringBuilder sb = new StringBuilder();
		sb.append(arr[0]+"\n");
		for(int i = 1; i < n; i++){
	   		if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]+"\n");
			}
		}
	    
	    System.out.print(sb);
	    br.close();
	}
}
