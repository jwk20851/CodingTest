//https://www.acmicpc.net/problem/1735

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int numerator = Integer.parseInt(a[0])*Integer.parseInt(b[1])+ Integer.parseInt(a[1])*Integer.parseInt(b[0]);
        int denominator = Integer.parseInt(a[1])*Integer.parseInt(b[1]);
        
        int mod = (numerator>=denominator)? GCD(numerator,denominator) : GCD(denominator,numerator);
        numerator /= mod;
        denominator /= mod;
        
        System.out.print(numerator+" "+denominator);
    }
    
    private static int GCD(int a, int b){
        int tmp = a%b;
        if(tmp == 0)
            return b;
        
        return GCD(b, tmp);
    }
}