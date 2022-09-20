https://www.acmicpc.net/problem/1003

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static int[,] dp = new int[41, 41];
        static void Main(string[] args)
        {
            dp[0, 1] = dp[1, 0] = 0;
            dp[0, 0] = dp[1, 1] = 1;

            for (int i = 2; i < 41; i++)
            {
                dp[i, 0] = dp[i - 1, 0] + dp[i - 2, 0];
                dp[i, 1] = dp[i - 1, 1] + dp[i - 2, 1];
            }

            int n = int.Parse(Console.ReadLine());
            StringBuilder sb = new StringBuilder();
            while (n-- > 0)
            {
                int m = int.Parse(Console.ReadLine());
                sb.Append(dp[m, 0] + " " + dp[m, 1] + "\n");
            }

            Console.Write(sb);
        }
    }
}