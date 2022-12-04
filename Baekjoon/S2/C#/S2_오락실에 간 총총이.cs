https://www.acmicpc.net/problem/26071

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int l = n, u = n;
            int r = -1, d = -1;
            for (int i = 0; i < n; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < n; j++)
                {
                    if (str[j] == 'G')
                    {
                        l = Math.Min(l, j);
                        u = Math.Min(u, i);
                        r = Math.Max(r, j);
                        d = Math.Max(d, i);
                    }
                }
            }

            int ans = 0;
            if (l != r)
                ans = Math.Min(r, n - 1 - l);
            if (u != d)
                ans += Math.Min(d, n - 1 - u);

            Console.Write(ans);
        }
    }
}