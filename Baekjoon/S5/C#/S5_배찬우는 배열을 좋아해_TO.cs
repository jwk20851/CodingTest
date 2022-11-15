https://www.acmicpc.net/problem/25966

using System;
using System.Text;

namespace Baekjoon
{
    class Program
    {
        static int[,] arr;
        static int n = 0, m = 0, q = 0;
        static void Main(string[] args)
        {
            int[] nmq = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = nmq[0];
            m = nmq[1];
            q = nmq[2];

            arr = new int[n, m];
            for (int i = 0; i < n; i++)
            {
                int[] tmp = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < m; j++)
                {
                    arr[i, j] = tmp[j];
                }
            }

            for (int i = 0; i < q; i++)
            {
                int[] tmp = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                if (tmp[0] == 0)
                    arr[tmp[1], tmp[2]] = tmp[3];
                else
                    swap(tmp[1], tmp[2]);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    sb.Append(arr[i, j] + " ");
                }
                sb.Append("\n");
            }
            Console.Write(sb);
        }

        static void swap(int a, int b)
        {
            int check = 0;
            for (int i = 0; i < m; i++)
            {
                check = arr[a, i];
                arr[a, i] = arr[b, i];
                arr[b, i] = check;
            }
        }
    }
}