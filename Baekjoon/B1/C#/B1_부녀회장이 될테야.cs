https://www.acmicpc.net/problem/2775

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            int max = 14;
            int[,] dp = new int[max + 1, max + 1];

            for (int i = 1; i <= max; i++)
                dp[0, i] = i;

            for (int i = 1; i <= max; i++)
            {
                for (int j = 1; j <= max; j++)
                {
                    for (int k = 1; k <= j; k++)
                    {
                        dp[i, j] += dp[i - 1, k];
                    }
                }
            }

            while (t-- > 0)
            {
                int k = int.Parse(Console.ReadLine());
                int n = int.Parse(Console.ReadLine());
                Console.WriteLine(dp[k, n]);
            }
        }
    }
}