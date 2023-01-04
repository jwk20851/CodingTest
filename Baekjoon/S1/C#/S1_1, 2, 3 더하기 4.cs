https://www.acmicpc.net/problem/15989

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            int[,] dp = new int[10001, 4];
            dp[1, 1] = dp[2, 1] = dp[2, 2] = dp[3, 1] = dp[3, 2] = dp[3, 3] = 1;


            for (int i = 4; i < 10001; i++)
            {
                dp[i, 1] = dp[i - 1, 1];
                dp[i, 2] = dp[i - 2, 1] + dp[i - 2, 2];
                dp[i, 3] = dp[i - 3, 1] + dp[i - 3, 2] + dp[i - 3, 3];
            }

            StringBuilder sb = new StringBuilder();
            while (T-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                sb.Append(dp[n, 1] + dp[n, 2] + dp[n, 3] + "\n");
            }

            Console.Write(sb);
        }
    }
}