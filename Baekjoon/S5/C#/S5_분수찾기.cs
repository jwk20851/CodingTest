https://www.acmicpc.net/problem/1193

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = int.Parse(Console.ReadLine());
            int a = 0, b = 0, n = 0, cnt = 0;

            while (cnt < x)
            {
                n++;
                cnt = n * (n + 1) / 2;
            }

            if (n % 2 == 0)
            {
                a = n - (cnt - x);
                b = 1 + (cnt - x);
            }
            else
            {
                a = 1 + (cnt - x);
                b = n - (cnt - x);
            }

            Console.WriteLine(a + "/" + b);
        }
    }
}