//https://www.acmicpc.net/problem/12789

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stu = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            stu[i] = Integer.parseInt(st.nextToken());
        
        Stack<Integer> stack = new Stack<Integer>();
        int order = 1;
        for(int i = 0; i < N; i++){
            if(order == stu[i])
                order++;
            else{
                if(!stack.isEmpty() && stack.peek() == order){
                    stack.pop();
                    i--;
                    order++;
                }
                else
                    stack.push(stu[i]);
            }
        }
        
        for(int i = 0; i < stack.size(); i++){
            int tmp = stack.pop();
            if(tmp == order)
                order++;
            else{
                System.out.print("Sad");
                return;
            }
        }
        
        System.out.print("Nice");
	}
}