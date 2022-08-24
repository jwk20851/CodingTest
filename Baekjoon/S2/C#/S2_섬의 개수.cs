https://www.acmicpc.net/problem/4963

using System;
using System.Collections.Generic;

namespace Baekjoon
{
    class Program
    {
        static int[,] map;
        static bool[,] visit;

        static int n = 0;
        static int m = 0;

        static Queue<(int, int)> q = new Queue<(int, int)>();
        static int[] dx = { 0, 1, 0, -1, 1, 1, -1, -1 };
        static int[] dy = { 1, 0, -1, 0, 1, -1, 1, -1 };

        static void Main(string[] args)
        {
            while (true)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                n = arr[0];
                m = arr[1];

                if (n == 0 && m == 0)
                    break;

                map = new int[m, n];
                visit = new bool[m, n];

                for (int i = 0; i < m; i++)
                {
                    int[] island = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                    for (int j = 0; j < n; j++)
                    {
                        map[i, j] = island[j];
                    }
                }

                int cnt = 0;
                for (int i = 0; i < m; i++)
                {
                    for (int j = 0; j < n; j++)
                    {
                        if (map[i, j] == 1 && visit[i, j] == false)
                        {
                            BFS(i, j);
                            cnt++;
                        }
                    }
                }
                Console.WriteLine(cnt);
            }
        }

        static void BFS(int x, int y)
        {
            q.Enqueue((x, y));
            visit[x, y] = true;

            int nx = 0;
            int ny = 0;
            while (q.Count > 0)
            {
                var coor = q.Dequeue();
                x = coor.Item1;
                y = coor.Item2;

                for (int i = 0; i < 8; i++)
                {
                    nx = x + dx[i];
                    ny = y + dy[i];

                    if (nx >= 0 && nx < m && ny >= 0 && ny < n)
                    {
                        if (map[nx, ny] == 1 && visit[nx, ny] == false)
                        {
                            q.Enqueue((nx, ny));
                            visit[nx, ny] = true;
                        }
                    }
                }
            }
        }
    }
}