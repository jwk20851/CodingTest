https://www.acmicpc.net/problem/9655

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[1001];

            dp[1] = dp[3] = 1;
            dp[2] = 2;
            for (int i = 4; i <= n; i++)
                dp[i] = Math.Min(dp[i - 1], dp[i - 3]) + 1;

            Console.WriteLine((dp[n] % 2 == 0) ? "CY" : "SK");
        }
    }
}