https://www.acmicpc.net/problem/9461

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            long[] dp = new long[101];
            dp[1] = dp[2] = dp[3] = 1;
            dp[4] = dp[5] = 2;

            for (int i = 6; i <= 100; i++)
                dp[i] = dp[i - 1] + dp[i - 5];

            int t = int.Parse(Console.ReadLine());
            while (t-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                Console.WriteLine(dp[n]);
            }
        }
    }
}