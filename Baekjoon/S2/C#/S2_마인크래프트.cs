https://www.acmicpc.net/problem/18111

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nmb = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int n = nmb[0];
            int m = nmb[1];
            int b = nmb[2];
            int[,] gr = new int[n, m];

            int min = Int32.MaxValue;
            int max = Int32.MinValue;
            for (int i = 0; i < n; i++)
            {
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                for (int j = 0; j < m; j++)
                {
                    gr[i, j] = arr[j];
                    max = Math.Max(gr[i, j], max);
                    min = Math.Min(gr[i, j], min);
                }
            }

            int ansSec = Int32.MaxValue;
            int ansH = Int32.MinValue;
            for (int i = min; i <= max; i++)
            {
                int sec = 0;
                int inven = b;

                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < m; k++)
                    {
                        int tmp = gr[j, k] - i;

                        if (tmp > 0)
                        {
                            sec += tmp * 2;
                            inven += tmp;
                        }
                        else if (tmp < 0)
                        {
                            sec += Math.Abs(tmp);
                            inven -= Math.Abs(tmp);
                        }
                    }
                }

                if (inven >= 0)
                {
                    if (sec <= ansSec)
                    {
                        ansSec = sec;
                        ansH = i;
                    }
                }
            }

            Console.Write(ansSec + " " + ansH);
        }
    }
}