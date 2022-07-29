https://www.acmicpc.net/submit/1929

using System;

namespace Baekjoon{
    class Program{
        static void Main(string[] args){
            StreamWriter sw = new (new BufferedStream(Console.OpenStandardOutput()));
            
            string[] arr = Console.ReadLine().Split(' ');
            int m = int.Parse(arr[0]);
            int n = int.Parse(arr[1]);
            int[] sosu = new int[n+1];
            
            for(int i = 2; i <= Math.Sqrt(n); i++){
                if(sosu[i] == 0){
                    for(int j = i*2; j <= n; j += i){
                        sosu[j] = 1;
                    }
                }
            } 
            
            for(int i = Math.Max(m, 2); i <= n; i++){
                if(sosu[i] == 0)
                    sw.WriteLine(i);
            }
            sw.Close();
        }
    }
}