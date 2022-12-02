https://www.acmicpc.net/problem/5014

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int f, s, g, u, d;
        static bool[] visit;
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            f = arr[0];
            s = arr[1];
            g = arr[2];
            u = arr[3];
            d = arr[4];

            visit = new bool[f + 1];
            int ans = BFS();

            if (ans >= 0)
                Console.Write(ans);
            else
                Console.Write("use the stairs");
        }

        static int BFS()
        {
            Queue<(int, int)> q = new Queue<(int, int)>();

            q.Enqueue((s, 0));
            visit[s] = true;
            while (q.Count > 0)
            {
                var v = q.Dequeue();
                int x = v.Item1;
                int y = v.Item2;

                if (x == g)
                    return y;
                if (x + u <= f && !visit[x + u])
                {
                    q.Enqueue((x + u, y + 1));
                    visit[x + u] = true;
                }
                if (x - d > 0 && !visit[x - d])
                {
                    q.Enqueue((x - d, y + 1));
                    visit[x - d] = true;
                }
            }

            return -1;
        }
    }
}