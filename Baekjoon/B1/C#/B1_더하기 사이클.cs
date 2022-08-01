https://www.acmicpc.net/problem/1110

using System;

namespace Baekjoon{
    class Program{
        static void Main(string[] args){
            int a = int.Parse(Console.ReadLine());
            int b = a;
            int sum = 0, cnt = 0;
            
            do{
                sum = (b/10) + (b%10);
                b = (b%10)*10 + sum%10;
                cnt++;
            }while(a != b);
            
            Console.WriteLine(cnt);
        }
    }
}