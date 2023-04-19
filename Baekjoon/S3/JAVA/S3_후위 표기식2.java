//https://www.acmicpc.net/problem/1935

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		double[] num = new double[N];
		for(int i = 0; i < N; i++)
		    num[i] = Integer.parseInt(br.readLine());
		
		Stack<Double> st = new Stack<Double>();
		double ans = 0;
		for(int i = 0; i < str.length(); i++){
		    char c = str.charAt(i);
		    
		    if('A' <= c && c <= 'Z')
                st.push(num[c-'A']);
            else{
                if(st.isEmpty())
                    break;
                
                double post = st.pop();
                double pre = st.pop();
                switch(c){
                    case '+':
                        ans = pre+post;
                        st.push(ans);
                        continue;
                    case '-':
                        ans = pre-post;
                        st.push(ans);
                        continue;
                    case '*':
                        ans = pre*post;
                        st.push(ans);
                        continue;
                    case '/':
                        ans = pre/post;
                        st.push(ans);
                        continue;
                }
            }
		}
		
		System.out.printf("%.2f", ans);
	}
}