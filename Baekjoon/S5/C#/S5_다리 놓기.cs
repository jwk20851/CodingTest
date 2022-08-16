https://www.acmicpc.net/problem/1010

using System;

namespace Baekjoon
{
    class Program
    {
        static int[,] dp = new int[31, 31];

        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            for (int i = 1; i <= 30; i++)
                dp[1, i] = i;

            for (int i = 2; i <= 30; i++)
            {
                for (int j = i; j <= 30; j++)
                {
                    for (int k = j - 1; k >= 1; k--)
                    {
                        dp[i, j] += dp[i - 1, k];
                    }
                }
            }

            while (t-- > 0)
            {
                string[] str = Console.ReadLine().Split();
                Console.WriteLine(dp[int.Parse(str[0]), int.Parse(str[1])]);
            }
        }
    }
}