https://www.acmicpc.net/problem/2644

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int ans = -1, n = 0;
        static int[,] pp;
        static bool[] visit;
        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int a = arr[0], b = arr[1];

            int m = int.Parse(Console.ReadLine());
            pp = new int[n + 1, n + 1];
            visit = new bool[n + 1];
            while (m-- > 0)
            {
                arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                pp[arr[0], arr[1]] = pp[arr[1], arr[0]] = 1;
            }

            DFS(a, b, 0);

            Console.WriteLine(ans);
        }

        static void DFS(int f, int s, int dep)
        {
            if (f == s)
            {
                ans = dep;
                return;
            }

            visit[f] = true;
            for (int i = 1; i <= n; i++)
            {
                if (!visit[i] && pp[f, i] == 1)
                {
                    DFS(i, s, dep + 1);
                }
            }
        }
    }
}