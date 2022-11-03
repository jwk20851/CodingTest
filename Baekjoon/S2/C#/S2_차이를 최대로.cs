https://www.acmicpc.net/problem/10819

using System;

namespace Baekjoon
{
    class Program
    {
        static int n, ans;
        static int[] arr;
        static bool[] visit;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            visit = new bool[n];
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            DFS(0, 0, 0);

            Console.Write(ans);
        }

        static void DFS(int tmp, int cnt, int sum)
        {
            if (cnt == n)
            {
                ans = Math.Max(sum, ans);
                return;
            }

            for (int i = 0; i < n; i++)
            {
                if (!visit[i])
                {
                    visit[i] = true;
                    DFS(arr[i], cnt + 1, (cnt == 0) ? 0 : sum + Math.Abs(tmp - arr[i]));
                    visit[i] = false;
                }
            }
        }
    }
}