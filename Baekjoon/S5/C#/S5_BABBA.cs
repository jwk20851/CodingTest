https://www.acmicpc.net/problem/9625

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[,] dp = new int[46, 2];
            dp[0, 0] = 1;
            dp[0, 1] = 0;

            for (int i = 1; i < 46; i++)
            {
                dp[i, 0] += dp[i - 1, 1];
                dp[i, 1] = dp[i - 1, 0] + dp[i - 1, 1];
            }

            Console.WriteLine(dp[n, 0] + " " + dp[n, 1]);
        }
    }
}