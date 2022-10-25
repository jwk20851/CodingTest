https://www.acmicpc.net/problem/1094

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int stick = 64;
            int cnt = 0;

            while (n > 0)
            {
                if (stick > n)
                    stick /= 2;
                else
                {
                    n -= stick;
                    cnt++;
                }
            }

            Console.Write(cnt);
        }
    }
}