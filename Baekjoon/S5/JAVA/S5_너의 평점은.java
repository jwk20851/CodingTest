//https://www.acmicpc.net/problem/25206

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0, cnt = 0;
        for(int i = 0; i < 20; i++){
            String[] tmp = br.readLine().split(" ");
            
            double g = Double.parseDouble(tmp[1]);
            switch(tmp[2]){
                case "A+":
                    sum+=g*4.5;
                    break;
                case "A0":
                    sum+=g*4.0;
                    break;
                case "B+":
                    sum+=g*3.5;
                    break;
                case "B0":
                    sum+=g*3.0;
                    break;
                case "C+":
                    sum+=g*2.5;
                    break;
                case "C0":
                    sum+=g*2.0;
                    break;
                case "D+":
                    sum+=g*1.5;
                    break;
                case "D0":
                    sum+=g*1.0;
                    break;
            }
            
            if(!tmp[2].equals("P"))
                cnt+=g;
        }
        
        if(cnt != 0)
            sum /= cnt;
        
        System.out.printf("%.6f", sum);
	}
}