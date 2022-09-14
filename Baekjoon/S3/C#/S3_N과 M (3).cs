https://www.acmicpc.net/problem/15651

using System;
using System.Text;

namespace Beakjoon
{
    class Program
    {
        static int[] arr;
        static int n, m;
        static StringBuilder sb = new StringBuilder();

        static void Main(string[] args)
        {
            arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            n = arr[0];
            m = arr[1];

            arr = new int[m + 1];

            BT(0);
            Console.Write(sb);
        }

        static void BT(int idx)
        {
            if (idx == m)
            {
                for (int i = 0; i < m; i++)
                    sb.Append(arr[i] + " ");
                sb.Append("\n");
                return;
            }

            for (int i = 1; i <= n; i++)
            {
                arr[idx] = i;
                BT(idx + 1);
            }
        }
    }
}