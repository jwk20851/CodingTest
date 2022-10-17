https://www.acmicpc.net/problem/24479
//메모리 초과
using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static int[] ans;
        static int[,] map;
        static bool[] visit;
        static int n, cnt = 1;

        static void Main(string[] args)
        {
            int[] nmr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = nmr[0];
            int m = nmr[1];
            int r = nmr[2];

            map = new int[n + 1, n + 1];
            visit = new bool[n + 1];
            ans = new int[n + 1];

            for (int i = 0; i < m; i++)
            {
                int[] uv = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                map[uv[0], uv[1]] = map[uv[1], uv[0]] = 1;
            }

            DFS(r);

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++)
                sb.AppendLine($"{ans[i]}");

            Console.Write(sb);
        }

        static void DFS(int r)
        {
            visit[r] = true;
            ans[r] = cnt++;

            for (int i = 1; i <= n; i++)
            {
                if (!visit[i] && map[r, i] == 1)
                {
                    DFS(i);
                }
            }
        }
    }
}