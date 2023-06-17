//https://www.acmicpc.net/problem/13411

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
		StringTokenizer st;
		Point[] p = new Point[N];
	    for(int i = 0; i < N; i++){
	        st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        int v = Integer.parseInt(st.nextToken());
	        
	        double tmp = Math.sqrt(x*x + y*y);
	        
	        p[i] = new Point(i+1, tmp/v);
	    }
	    
	    Arrays.sort(p, new Comparator<Point>(){
	        @Override
	        public int compare(Point o1, Point o2){
                if(o1.val == o2.val)
                    return o1.idx - o2.idx;
                else
                    return (o1.val>o2.val)? 1 : -1;
            }
	    });
	    
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++)
            sb.append(p[i].idx+"\n");
        
        System.out.print(sb);
	}
	
	static class Point{
        int idx;
        double val;
        public Point(int idx, double val){
            this.idx = idx;
            this.val = val;
        }
    }
}