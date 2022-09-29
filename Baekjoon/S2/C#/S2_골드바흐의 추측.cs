https://www.acmicpc.net/problem/9020

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());
            int max = 10001;
            bool[] dp = new bool[max];

            for (int i = 2; i <= Math.Sqrt(max); i++)
            {
                if (!dp[i])
                {
                    for (int j = 2 * i; j < max; j += i)
                    {
                        dp[j] = true;
                    }
                }
            }

            while (T-- > 0)
            {
                int n = int.Parse(Console.ReadLine());
                int a = n / 2;
                int b = n - a;

                while (true)
                {
                    if (!dp[a] && !dp[b])
                    {
                        Console.WriteLine(a + " " + b);
                        break;
                    }
                    else
                    {
                        a--;
                        b++;
                    }
                }
            }
        }
    }
}