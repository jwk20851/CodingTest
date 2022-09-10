https://www.acmicpc.net/problem/1018

using System;

namespace Beakjoon
{
    class Program
    {
        static char[,] chess;
        static void Main(string[] args)
        {
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = arr[0];
            int m = arr[1];
            chess = new char[n, m];

            for (int i = 0; i < n; i++)
            {
                string str = Console.ReadLine();
                for (int j = 0; j < m; j++)
                {
                    chess[i, j] = str[j];
                }
            }

            int min = Int32.MaxValue;
            for (int i = 0; i < n - 7; i++)
            {
                for (int j = 0; j < m - 7; j++)
                {
                    min = Math.Min(min, Check(i, j));
                }
            }

            Console.Write(min);
        }

        static int Check(int x, int y)
        {
            char checker = chess[x, y];
            int cnt = 0;

            for (int i = x; i < x + 8; i++)
            {
                for (int j = y; j < y + 8; j++)
                {
                    if (chess[i, j] != checker)
                        cnt++;
                    checker = (checker == 'B') ? 'W' : 'B';
                }
                checker = (checker == 'B') ? 'W' : 'B';
            }
            return Math.Min(cnt, 64 - cnt);
        }
    }
}