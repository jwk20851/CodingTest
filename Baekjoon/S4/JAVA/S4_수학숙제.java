//https://www.acmicpc.net/problem/2870

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<BigInteger> li = new LinkedList<BigInteger>();
		for(int i = 0; i < N; i++){
		    String str = changeStr(br.readLine());    //br.readLine().split("\\D")�����ε� ����
		    String[] arr = str.split("-");            //\D == ���ڸ� ������ ��� ���ڸ� ĳġ�ϴ� �ڵ�
		    for(int k = 0; k < arr.length; k++){
		        if(!arr[k].equals(""))
		            li.add(new BigInteger(arr[k]));
		    }
		}

	    Collections.sort(li);   //== li.sort(null);
	    
	    for(int j = 0; j < li.size(); j++)
	        System.out.println(li.get(j));
    }
    
    private static String changeStr(String s){
        String tmp = "";
        for(int j = 0; j < s.length(); j++){
	        char c = s.charAt(j);
	        if(c < 48 || c > 57)
	            c = '-';
	        
	        tmp += c;
	    }
	    
	    return tmp;
    }
}