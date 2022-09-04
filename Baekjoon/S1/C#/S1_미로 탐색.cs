https://www.acmicpc.net/problem/2178

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int n, m;
        static int[,] map;
        static bool[,] visit;

        static Queue<(int, int)> q = new Queue<(int, int)>();
        static int[] dx = { -1, 1, 0, 0 };
        static int[] dy = { 0, 0, -1, 1 };

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = arr[0];
            m = arr[1];

            map = new int[101, 101];
            visit = new bool[101, 101];
            for (int i = 0; i < n; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < m; j++)
                {
                    map[i, j] = str[j] - '0';
                }
            }

            BFS(0, 0);

            Console.WriteLine(map[n - 1, m - 1]);
        }

        static void BFS(int x, int y)
        {
            q.Enqueue((x, y));
            visit[x, y] = true;

            while (q.Count > 0)
            {
                var v = q.Dequeue();
                x = v.Item1;
                y = v.Item2;

                for (int i = 0; i < 4; i++)
                {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (Check(nx, ny))
                    {
                        if (map[nx, ny] == 1 && !visit[nx, ny])
                        {
                            q.Enqueue((nx, ny));
                            map[nx, ny] = map[x, y] + 1;
                        }
                    }
                }
            }
        }

        static bool Check(int nx, int ny)
        {
            if (nx >= 0 && nx < n && ny >= 0 && ny < m)
                return true;
            else
                return false;
        }
    }
}