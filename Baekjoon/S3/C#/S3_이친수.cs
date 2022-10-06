https://www.acmicpc.net/problem/2193

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            long n = long.Parse(Console.ReadLine());
            long[] dp = new long[n + 1];

            dp[0] = 0;
            dp[1] = 1;
            for (long i = 2; i <= n; i++)
                dp[i] = dp[i - 1] + dp[i - 2];

            Console.Write(dp[n]);
        }
    }
}