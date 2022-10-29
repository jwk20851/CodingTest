https://www.acmicpc.net/problem/9465

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            StringBuilder sb = new StringBuilder();

            while (t-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                int[,] dp = new int[2, n + 1];
                int[] uArr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int[] dArr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                dp[0, 0] = dp[1, 0] = 0;
                dp[0, 1] = uArr[0];
                dp[1, 1] = dArr[0];

                if (n >= 2)
                {
                    for (int i = 2; i <= n; i++)
                    {
                        dp[0, i] = Math.Max(dp[1, i - 1], dp[1, i - 2]) + uArr[i - 1];
                        dp[1, i] = Math.Max(dp[0, i - 1], dp[0, i - 2]) + dArr[i - 1];
                    }
                }

                sb.Append(Math.Max(dp[0, n], dp[1, n]) + "\n");
            }

            Console.Write(sb);
        }
    }
}