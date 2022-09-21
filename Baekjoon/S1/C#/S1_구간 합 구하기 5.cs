https://www.acmicpc.net/problem/11660

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            int[,] map = new int[n + 1, n + 1];
            for (int i = 1; i <= n; i++)
            {
                int[] str = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 1; j <= n; j++)
                    map[i, j] = str[j - 1];
            }

            int[,] dp = new int[n + 1, n + 1];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                    dp[i, j] = dp[i, j - 1] + dp[i - 1, j] - dp[i - 1, j - 1] + map[i, j];
            }

            StringBuilder sb = new StringBuilder();
            while (m-- > 0)
            {
                int[] xy = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int x1 = xy[0];
                int y1 = xy[1];
                int x2 = xy[2];
                int y2 = xy[3];
                int sum = dp[x2, y2] - dp[x1 - 1, y2] - dp[x2, y1 - 1] + dp[x1 - 1, y1 - 1];
                sb.Append(sum + "\n");
            }

            Console.Write(sb);
        }
    }
}