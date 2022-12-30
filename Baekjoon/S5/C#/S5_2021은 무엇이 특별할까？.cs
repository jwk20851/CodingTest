https://www.acmicpc.net/problem/24039

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int ans = 0;
            bool[] check = new bool[10001];
            List<int> li = new List<int>();

            for (int i = 2; i <= Math.Sqrt(10000); i++)
            {
                if (check[i])
                    continue;

                for (int j = i + i; j <= 10000; j += i)
                    check[j] = true;
            }

            for (int i = 2; i <= 10000; i++)
                if (!check[i])
                    li.Add(i);

            for (int i = 0; i < li.Count - 1; i++)
            {
                ans = li[i] * li[i + 1];
                if (ans > n)
                {
                    Console.WriteLine(ans);
                    break;
                }
            }
        }
    }
}