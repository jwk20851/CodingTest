https://www.acmicpc.net/problem/1904

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int mod = 15746;
            int[] dp = new int[1000001];

            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++)
                dp[i] = (dp[i - 1] + dp[i - 2]) % mod;

            Console.WriteLine(dp[n] % mod);
        }
    }
}