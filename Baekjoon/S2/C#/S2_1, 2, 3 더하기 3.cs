https://www.acmicpc.net/problem/15988

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());
            long[] dp = new long[1000001];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i < 1000001; i++)
                dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;

            StringBuilder sb = new StringBuilder();
            while (t-- > 0)
                sb.Append(dp[int.Parse(Console.ReadLine())] + "\n");

            Console.Write(sb);
        }
    }
}