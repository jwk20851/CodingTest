https://www.acmicpc.net/problem/1699

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[n + 1];

            for (int i = 1; i <= n; i++)
            {
                dp[i] = i;
                for (int j = 1; j * j <= i; j++)
                {
                    if (dp[i] > dp[i - j * j] + 1)
                        dp[i] = dp[i - j * j] + 1;
                }
            }

            Console.Write(dp[n]);
        }
    }
}