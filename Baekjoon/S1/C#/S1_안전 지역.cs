https://www.acmicpc.net/problem/2468

using System;

namespace Beakjoon
{
    class Program
    {
        static int n = 0;
        static int[,] realMap;
        static int[,] copyMap;
        static bool[,] visit;

        static int[] dx = { -1, 1, 0, 0 };
        static int[] dy = { 0, 0, -1, 1 };

        static void Main(string[] args)
        {
            n = int.Parse(Console.ReadLine());
            realMap = new int[n, n];

            int max = 0;
            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < n; j++)
                {
                    max = Math.Max(max, arr[j]);
                    realMap[i, j] = arr[j];
                }
            }

            int answer = 1;
            for (int i = 1; i < max; i++)
            {
                SetMap(i);
                int area = 0;

                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        if (!visit[j, k] && copyMap[j, k] == 1)
                        {
                            DFS(j, k);
                            area++;
                        }
                    }
                }
                answer = Math.Max(answer, area);
            }

            Console.Write(answer);
        }

        static void SetMap(int h)
        {
            visit = new bool[n, n];
            copyMap = new int[n, n];

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    copyMap[i, j] = (realMap[i, j] > h) ? 1 : 0;
            }
        }

        static void DFS(int x, int y)
        {
            visit[x, y] = true;

            for (int i = 0; i < 4; i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                if (!visit[nx, ny] && copyMap[nx, ny] == 1)
                    DFS(nx, ny);
            }
        }
    }
}