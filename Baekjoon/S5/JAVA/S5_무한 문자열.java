//https://www.acmicpc.net/problem/12871

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		if(s.length() == t.length()){
			System.out.print(s.equals(t)? 1 : 0);
			return;
		}
		
		int len =  LCM(s.length(), t.length());
		String sumS = s, sumT = t;
		while(sumS.length() < len){
			sumS += s;
		}
		while(sumT.length() < len){
			sumT += t;
		}
		
        System.out.print(sumS.equals(sumT)? 1 : 0);
    }
    
    private static int LCM(int a, int b){
		return (a*b)/GCD(a, b);
    }
    
    private static int GCD(int a, int b){
		if(b == 0)
		    return a;
		return GCD(b, a%b);
	}
}