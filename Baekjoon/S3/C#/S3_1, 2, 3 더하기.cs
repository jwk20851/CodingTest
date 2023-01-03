https://www.acmicpc.net/problem/9095

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            int[] dp = new int[12];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i < 12; i++)
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

            while (T-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                Console.WriteLine(dp[n]);
            }
        }
    }
}