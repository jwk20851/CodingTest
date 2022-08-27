https://www.acmicpc.net/problem/10971

using System;

namespace Baekjoon
{
    class Program
    {
        static int[,] city;
        static bool[] visit;
        static int n = 0;
        static int first = 0;
        static int answer = 99999999;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            city = new int[n, n];
            visit = new bool[n];

            for (int i = 0; i < n; i++)
            {
                string[] str = Console.ReadLine().Split(' ');
                for (int j = 0; j < n; j++)
                {
                    city[i, j] = int.Parse(str[j]);
                }
            }

            for (int i = 0; i < n; i++)
            {
                first = i;
                DFS(i, 0, 0);
            }

            Console.Write(answer);
        }

        static void DFS(int idx, int cnt, int sum)
        {
            if (cnt == n - 1)
            {
                if (city[idx, first] != 0)
                {
                    answer = Math.Min(answer, sum + city[idx, first]);
                }
                return;
            }

            visit[idx] = true;

            for (int i = 0; i < n; i++)
            {
                if (!visit[i] && city[idx, i] > 0)
                {
                    visit[i] = true;
                    DFS(i, cnt + 1, sum + city[idx, i]);
                    visit[i] = false;
                }
            }
        }
    }
}