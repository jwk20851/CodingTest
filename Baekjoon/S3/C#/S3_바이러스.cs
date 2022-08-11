https://www.acmicpc.net/problem/2606

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int[,] pc = new int[101, 101];
        static int[] visit = new int[101];
        static int n, m;

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            m = int.Parse(Console.ReadLine());
            int[] virus = new int[2];
            int x = 0, y = 0;
            for (int i = 0; i < m; i++)
            {
                virus = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                x = virus[0];
                y = virus[1];
                pc[x, y] = pc[y, x] = 1;
            }

            Console.WriteLine(BFS(1));
        }

        static int BFS(int start)
        {
            Queue<int> q = new Queue<int>();
            int cnt = 0;
            int v = 0;
            q.Enqueue(start);
            visit[start] = 1;

            while (q.Count > 0)
            {
                v = q.Dequeue();
                for (int i = 1; i <= n; i++)
                {
                    if (visit[i] == 0 && pc[v, i] == 1)
                    {
                        q.Enqueue(i);
                        visit[i] = 1;
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }
}