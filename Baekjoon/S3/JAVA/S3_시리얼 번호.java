//https://www.acmicpc.net/problem/1431

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Guitar[] arr = new Guitar[N];
		for(int i = 0; i < N; i++){
		    String serial = br.readLine();
		    int len = serial.length();
		    int sum = sumN(serial);

		    arr[i] = new Guitar(serial, len, sum);
		}
		
		Arrays.sort(arr, new Comparator<Guitar>(){
		    @Override
		    public int compare(Guitar o1, Guitar o2){
                if(o1.len == o2.len){
                    if(o1.sum == o2.sum)
                        return o1.serial.compareTo(o2.serial);  //문자열 사전순 정렬
                    else
                        return o1.sum-o2.sum;   //자리수 합 오름차순
                }
                else
                    return o1.len-o2.len;   //문자열 길이 오름차순
            }
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++)
		    sb.append(arr[i].serial+"\n");
		
		System.out.print(sb);
	}
    
    private static int sumN(String str){
        str = str.replaceAll("\\D", "");    //문자열에서 문자 제거
        
        int sum = 0;
        for(int i = 0; i < str.length(); i++)
            sum += str.charAt(i)-'0';       //각 자리수 덧셈
        
        return sum;
    }
    
    static class Guitar{
        String serial;
        int len, sum;
        public Guitar(String serial, int len, int sum){
            this.serial = serial;
            this.len = len;
            this.sum = sum;
        }
    }
}