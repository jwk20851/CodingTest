https://www.acmicpc.net/problem/1260

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int MAX = 1001;
        static int[,] point = new int[MAX, MAX];
        static int[] visit = new int[MAX];
        static int n, m, v;

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = arr[0];
            m = arr[1];
            v = arr[2];

            int x = 0, y = 0;
            for (int i = 0; i < m; i++)
            {
                int[] line = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                x = line[0];
                y = line[1];
                point[x, y] = point[y, x] = 1;
            }

            DFS(v);
            reset();
            BFS(v);
        }

        static void DFS(int v)
        {
            visit[v] = 1;
            Console.Write(v + " ");
            for (int i = 1; i <= n; i++)
            {
                if (visit[i] == 0 && point[v, i] == 1)
                {
                    visit[i] = 1;
                    DFS(i);
                }
            }
        }

        static void BFS(int v)
        {
            Queue<int> q = new Queue<int>();
            q.Enqueue(v);
            visit[v] = 1;
            while (q.Count > 0)
            {
                v = q.Dequeue();
                Console.Write(v + " ");
                for (int i = 1; i <= n; i++)
                {
                    if (visit[i] == 0 && point[v, i] == 1)
                    {
                        q.Enqueue(i);
                        visit[i] = 1;
                    }
                }
            }
        }

        static void reset()
        {
            for (int i = 0; i < visit.Length; i++)
                visit[i] = 0;
            Console.WriteLine();
        }
    }
}