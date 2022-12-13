https://www.acmicpc.net/problem/14916

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[100001];

            Array.Fill(dp, Int32.MaxValue);

            dp[2] = 1;
            dp[4] = 2;
            dp[5] = 1;

            for (int i = 6; i <= n; i++)
                dp[i] = Math.Min(dp[i - 2], dp[i - 5]) + 1;

            Console.WriteLine((dp[n] == Int32.MaxValue) ? -1 : dp[n]);
        }
    }
}