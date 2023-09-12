//https://www.acmicpc.net/problem/29197

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Set<Double> plus = new HashSet<>();
		Set<Double> minus = new HashSet<>();
		Set<String> zero = new HashSet<>();
		StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            
            if(x == 0 && y != 0)
                zero.add((y > 0)? "x" : "-x");
            else if(y == 0 && x != 0)
                zero.add((x > 0)? "y" : "-y");
            else{
                if(x > 0){
                    plus.add(x/y);
                }
                else if(x < 0){
                    minus.add(x/y);
                }
            }
        }

        System.out.print(plus.size()+minus.size()+zero.size());
    }
}