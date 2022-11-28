https://www.acmicpc.net/problem/26070

using System;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] gomgom = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] ticket = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int max = 0;

            for (int i = 0; i < 2; i++)
            {
                if (ticket[i] <= ticket[i + 1])
                    max = i + 1;
            }

            long cnt = 0;
            for (int idx = max; idx < max + 3; idx++)
            {
                int i = idx % 3;
                if (gomgom[i] >= ticket[i])
                {
                    gomgom[i] -= ticket[i];
                    cnt += ticket[i];
                }
                else
                {
                    ticket[i] -= gomgom[i];
                    cnt += gomgom[i];
                    ticket[(i + 1) % 3] += ticket[i] / 3;
                }
            }

            Console.Write(cnt);
        }
    }
}