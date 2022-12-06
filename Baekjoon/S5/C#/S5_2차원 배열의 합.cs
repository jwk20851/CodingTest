https://www.acmicpc.net/problem/2167

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nm = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = nm[0];
            int m = nm[1];

            int[,] arr = new int[n, m];
            for (int i = 0; i < n; i++)
            {
                int[] tmp = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < m; j++)
                    arr[i, j] = tmp[j];
            }

            int k = int.Parse(Console.ReadLine());
            while (k-- > 0)
            {
                int[] tmp = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                int i = tmp[0];
                int j = tmp[1];
                int x = tmp[2];
                int y = tmp[3];

                int sum = 0;
                for (int a = i - 1; a < x; a++)
                {
                    for (int b = j - 1; b < y; b++)
                        sum += arr[a, b];
                }
                Console.WriteLine(sum);
            }
        }
    }
}