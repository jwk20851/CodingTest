https://www.acmicpc.net/problem/1926

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int[,] map;
        static bool[,] visit;
        static int[] dx = { -1, 1, 0, 0 };
        static int[] dy = { 0, 0, -1, 1 };
        static int n, m;

        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = arr[0];
            m = arr[1];

            map = new int[n, m];
            visit = new bool[n, m];
            for (int i = 0; i < n; i++)
            {
                arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < m; j++)
                {
                    map[i, j] = arr[j];
                }
            }

            int cnt = 0, max = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (!visit[i, j] && map[i, j] == 1)
                    {
                        cnt++;
                        max = Math.Max(max, BFS(i, j));
                    }
                }
            }

            Console.WriteLine(cnt);
            Console.WriteLine(max);
        }

        static int BFS(int x, int y)
        {
            Queue<(int, int)> q = new Queue<(int, int)>();
            q.Enqueue((x, y));

            visit[x, y] = true;
            int size = 1;
            while (q.Count > 0)
            {
                var v = q.Dequeue();
                int vx = v.Item1;
                int vy = v.Item2;

                for (int i = 0; i < 4; i++)
                {
                    int nx = vx + dx[i];
                    int ny = vy + dy[i];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m)
                    {
                        if (!visit[nx, ny] && map[nx, ny] == 1)
                        {
                            visit[nx, ny] = true;
                            q.Enqueue((nx, ny));
                            size++;
                        }
                    }
                }
            }

            return size;
        }
    }
}