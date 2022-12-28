https://www.acmicpc.net/problem/9184

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static int[,,] dp = new int[21, 21, 21];
        static void Main(string[] args)
        {
            StringBuilder sb = new StringBuilder();
            while (true)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int a = arr[0], b = arr[1], c = arr[2];

                if (a == -1 && b == -1 && c == -1)
                    break;

                sb.Append($"w({a}, {b}, {c}) = {w(a, b, c)}\n");
            }

            Console.WriteLine(sb);
        }

        static int w(int a, int b, int c)
        {
            if (a <= 0 || b <= 0 || c <= 0)
                return 1;

            if (a > 20 || b > 20 || c > 20)
                return w(20, 20, 20);

            if (dp[a, b, c] != 0)
                return dp[a, b, c];

            if (a < b && b < c)
                return dp[a, b, c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

            return dp[a, b, c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
    }
}