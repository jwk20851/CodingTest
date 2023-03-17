//https://www.acmicpc.net/problem/4134

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        while(n-- > 0){
            long num = Long.parseLong(br.readLine());
			BigInteger bi = new BigInteger(String.valueOf(num));
			
			if(bi.isProbablePrime(10))  //소수 판별 메서드
				System.out.println(num);
			else
				System.out.println(bi.nextProbablePrime()); //해당 값 다음의 소수를 찾는 메서드
        }
    }
}