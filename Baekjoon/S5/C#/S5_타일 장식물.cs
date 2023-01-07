https://www.acmicpc.net/problem/13301

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            long[] dp = new long[n + 1];
            dp[0] = dp[1] = 1;

            for (int i = 2; i <= n; i++)
                dp[i] = dp[i - 1] + dp[i - 2];

            if (n == 1)
                Console.WriteLine(4);
            else
                Console.WriteLine(dp[n - 1] * 4 + dp[n - 2] * 2);
        }
    }
}