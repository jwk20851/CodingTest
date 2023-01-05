https://www.acmicpc.net/problem/9656

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

            for (int i = 4; i < 1001; i++)
                dp[i] = Math.Min(dp[i - 1], dp[i - 3]) % 2 + 1;

            Console.WriteLine((dp[n] % 2 == 0) ? "SK" : "CY");
        }
    }
}
