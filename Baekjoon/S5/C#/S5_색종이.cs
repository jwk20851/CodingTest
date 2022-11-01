https://www.acmicpc.net/problem/2563

using System;

namespace Beakjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            bool[,] map = new bool[101, 101];
            int cnt = 0;
            while (n-- > 0)
            {
                int[] points = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int x = points[0];
                int y = points[1];

                for (int i = x; i < x + 10; i++)
                {
                    for (int j = y; j < y + 10; j++)
                    {
                        if (!map[i, j])
                        {
                            map[i, j] = true;
                            cnt++;
                        }
                    }
                }
            }
            Console.Write(cnt);
        }
    }
}