https://www.acmicpc.net/problem/11727

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] dp = new int[n + 1];

            dp[1] = dp[0] = 1;

            for (int i = 2; i < n + 1; i++)
                dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;

            Console.Write(dp[n]);
        }
    }
}