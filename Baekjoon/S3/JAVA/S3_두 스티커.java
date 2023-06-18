//https://www.acmicpc.net/problem/16937

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    private static int H,W,N, ans = 0;
    private static List<Sticker> li;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		
		li = new ArrayList<Sticker>();
		N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    int h = Integer.parseInt(st.nextToken());
		    int w = Integer.parseInt(st.nextToken());
		    if((h>H && h>W) || (w>H && w>W))
		        continue;
		        
		    li.add(new Sticker(h, w));
		}
		
		checkArea();
		
		System.out.print(ans);
	}
	
	private static void checkArea(){
	    for(int i = 0; i < li.size(); i++){
	        Sticker tmp = li.get(i);
	        int extraH = H-tmp.h;
	        int extraW = W-tmp.w;
	        int fSize = tmp.w*tmp.h;
	        if(extraH>=0 && extraW>=0)
	            checkExtra(i, extraH, extraW, fSize);
	            
	        extraH = H-tmp.w;
	        extraW = W-tmp.h;
	        if(extraH>=0 && extraW>=0)
	            checkExtra(i, extraH, extraW, fSize);
	    }
	}
	
	private static void checkExtra(int idx, int h, int w, int fSize){
	    int sSize = 0;
	    for(int i = idx+1; i < li.size(); i++){
	        Sticker tmp = li.get(i);
	        if((tmp.h<=h && tmp.w<=W) || (tmp.h<=H && tmp.w<=w) || (tmp.w<=h && tmp.h<=W) || (tmp.w<=H && tmp.h<=w))
	            sSize = Math.max(sSize, tmp.h*tmp.w);
	    }
	    
	    if(sSize != 0)
            ans = Math.max(ans, fSize+sSize);
	}
	
	static class Sticker{
	    int h,w;
	    public Sticker(int h, int w){
	        this.h = h;
	        this.w = w;
	    }
	}
}