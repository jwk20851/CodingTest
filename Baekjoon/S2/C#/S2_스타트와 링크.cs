https://www.acmicpc.net/problem/14889

using System;

namespace Beakjoon
{
    class Program
    {
        static int n = 0;
        static int[,] map;
        static bool[] visit;
        static int min = Int32.MaxValue;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            map = new int[n, n];
            visit = new bool[n];

            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < n; j++)
                    map[i, j] = arr[j];
            }

            DFS(0, 0);

            Console.Write(min);
        }

        static void DFS(int idx, int cnt)
        {
            if (cnt == n / 2)
            {
                Check();
                return;
            }

            for (int i = idx; i < n; i++)
            {
                if (!visit[i])
                {
                    visit[i] = true;
                    DFS(i + 1, cnt + 1);
                    visit[i] = false;
                }
            }
        }

        static void Check()
        {
            int start = 0;
            int link = 0;

            for (int i = 0; i < n - 1; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (!visit[i] && !visit[j])
                        start += map[i, j] + map[j, i];
                    else if (visit[i] && visit[j])
                        link += map[i, j] + map[j, i];
                }
            }

            int tmp = Math.Abs(start - link);

            if (tmp == 0)
            {
                Console.Write(tmp);
                Environment.Exit(0);
            }

            min = Math.Min(min, tmp);
        }
    }
}