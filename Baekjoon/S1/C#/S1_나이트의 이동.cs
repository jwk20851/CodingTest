https://www.acmicpc.net/problem/7562

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int[,] map;
        static bool[,] visit;
        static int[] now, target;
        static int[,] dir = new int[,] { { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 } };
        static int l;
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());

            while (t-- > 0)
            {
                l = int.Parse(Console.ReadLine());
                map = new int[l, l];
                visit = new bool[l, l];
                now = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                target = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                BFS(now[0], now[1], 0);
            }
        }

        static void BFS(int x, int y, int cnt)
        {
            Queue<(int, int, int)> q = new Queue<(int, int, int)>();
            q.Enqueue((x, y, cnt));
            visit[x, y] = true;

            while (q.Count > 0)
            {
                var v = q.Dequeue();
                int vx = v.Item1;
                int vy = v.Item2;
                int vcnt = v.Item3;

                if (vx == target[0] && vy == target[1])
                {
                    Console.WriteLine(vcnt);
                    return;
                }

                for (int i = 0; i < 8; i++)
                {
                    int coorx = vx + dir[i, 0];
                    int coory = vy + dir[i, 1];

                    if (coorx >= 0 && coory >= 0 && coorx < l && coory < l)
                    {
                        if (!visit[coorx, coory])
                        {
                            visit[coorx, coory] = true;
                            q.Enqueue((coorx, coory, vcnt + 1));
                        }
                    }
                }
            }
        }
    }
}