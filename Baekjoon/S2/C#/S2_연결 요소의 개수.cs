https://www.acmicpc.net/problem/11724

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int[,] map;
        static bool[] visit;

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];

            map = new int[n + 1, n + 1];
            visit = new bool[n + 1];

            for (int i = 0; i < m; i++)
            {
                int[] line = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int x = line[0];
                int y = line[1];
                map[x, y] = map[y, x] = 1;
            }

            int cnt = 0;
            for (int i = 1; i <= n; i++)
            {
                if (visit[i] == false)
                {
                    BFS(i);
                    cnt++;
                }
            }
            Console.Write(cnt);
        }

        static void BFS(int n)
        {
            Queue<int> q = new Queue<int>();
            q.Enqueue(n);
            visit[n] = true;

            while (q.Count > 0)
            {
                int node = q.Dequeue();
                for (int i = 0; i < visit.Length; i++)
                {
                    if (map[node, i] == 1 && visit[i] == false)
                    {
                        q.Enqueue(i);
                        visit[i] = true;
                    }
                }
            }
        }

    }
}