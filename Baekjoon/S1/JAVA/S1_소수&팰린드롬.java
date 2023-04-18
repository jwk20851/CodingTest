//https://www.acmicpc.net/problem/1747

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(true){
            if(isPrime(N) && isPalindrome(N)){
                System.out.print(N);
                System.exit(0);
            }
            
            N++;
        }
	}
	
	public static boolean isPrime(int n){
        if(n == 1)
            return false;
            
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        
        return true;
    }
    
    public static boolean isPalindrome(int n){
        String str = Integer.toString(n);
        for(int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        }
        
        return true;
    }
}